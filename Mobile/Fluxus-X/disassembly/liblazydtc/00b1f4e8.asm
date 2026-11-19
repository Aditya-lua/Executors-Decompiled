; ossl_base_provider_init @ 00b1f4e8
00b1f4e8	stp x24,x23,[sp, #-0x40]!
00b1f4ec	stp x22,x21,[sp, #0x10]
00b1f4f0	mov x21,x0
00b1f4f4	mov x0,x1
00b1f4f8	stp x20,x19,[sp, #0x20]
00b1f4fc	stp x29,x30,[sp, #0x30]
00b1f500	add x29,sp,#0x30
00b1f504	mov x19,x3
00b1f508	mov x20,x2
00b1f50c	mov x22,x1
00b1f510	bl 0x00c40f90
00b1f514	cbz w0,0x00b1f5ec
00b1f518	adrp x9,0x77b000
00b1f51c	mov x24,xzr
00b1f520	add x8,x22,#0x8
00b1f524	add x9,x9,#0xbc0
00b1f528	adrp x10,0xd22000
00b1f52c	adrp x11,0xd22000
00b1f530	b 0x00b1f538
00b1f534	add x8,x8,#0x10
00b1f538	ldur w12,[x8, #-0x8]
00b1f53c	cmp w12,#0x4
00b1f540	b.hi 0x00b1f534
00b1f544	ldrsw x12,[x9, x12, LSL #0x2]
00b1f548	add x12,x12,x9
00b1f54c	br x12
00b1f550	ldr x12,[x8], #0x10
00b1f554	str x12,[x10, #0x7f8]
00b1f558	b 0x00b1f538
00b1f55c	ldr x12,[x8], #0x10
00b1f560	str x12,[x11, #0x800]
00b1f564	b 0x00b1f538
00b1f568	ldr x24,[x8]
00b1f56c	b 0x00b1f534
00b1f570	cbz x24,0x00b1f5d0
00b1f574	bl 0x00c40fc0
00b1f578	str x0,[x19]
00b1f57c	cbz x0,0x00b1f5d8
00b1f580	bl 0x00c40f80
00b1f584	ldr x23,[x19]
00b1f588	cbz x0,0x00b1f5dc
00b1f58c	mov x22,x0
00b1f590	mov x0,x21
00b1f594	blr x24
00b1f598	mov x1,x0
00b1f59c	mov x0,x23
00b1f5a0	bl 0x00c40ff0
00b1f5a4	ldr x0,[x19]
00b1f5a8	mov x1,x21
00b1f5ac	bl 0x00c40fe0
00b1f5b0	ldr x0,[x19]
00b1f5b4	mov x1,x22
00b1f5b8	bl 0x00c40fd0
00b1f5bc	adrp x8,0xc82000
00b1f5c0	add x8,x8,#0xd60
00b1f5c4	mov w0,#0x1
00b1f5c8	str x8,[x20]
00b1f5cc	b 0x00b1f5ec
00b1f5d0	mov w0,wzr
00b1f5d4	b 0x00b1f5ec
00b1f5d8	mov x23,xzr
00b1f5dc	mov x0,x23
00b1f5e0	bl 0x00c40fa0
00b1f5e4	mov w0,wzr
00b1f5e8	str xzr,[x19]
00b1f5ec	ldp x29,x30,[sp, #0x30]
00b1f5f0	ldp x20,x19,[sp, #0x20]
00b1f5f4	ldp x22,x21,[sp, #0x10]
00b1f5f8	ldp x24,x23,[sp], #0x40
00b1f5fc	ret
