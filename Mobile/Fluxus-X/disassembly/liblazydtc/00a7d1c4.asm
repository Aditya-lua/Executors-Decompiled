; ossl_ffc_params_set_validate_params @ 00a7d1c4
00a7d1c4	str x23,[sp, #-0x40]!
00a7d1c8	stp x22,x21,[sp, #0x10]
00a7d1cc	stp x20,x19,[sp, #0x20]
00a7d1d0	stp x29,x30,[sp, #0x30]
00a7d1d4	add x29,sp,#0x30
00a7d1d8	cbz x0,0x00a7d24c
00a7d1dc	mov x23,x0
00a7d1e0	mov x20,x0
00a7d1e4	ldr x0,[x23, #0x20]!
00a7d1e8	mov w19,w3
00a7d1ec	mov x21,x2
00a7d1f0	mov x22,x1
00a7d1f4	cbz x0,0x00a7d210
00a7d1f8	cmp x0,x22
00a7d1fc	b.eq 0x00a7d244
00a7d200	adrp x1,0x2a4000
00a7d204	add x1,x1,#0x111
00a7d208	mov w2,#0x54
00a7d20c	bl 0x00c32310
00a7d210	cbz x22,0x00a7d240
00a7d214	cbz x21,0x00a7d240
00a7d218	adrp x2,0x2a4000
00a7d21c	add x2,x2,#0x111
00a7d220	mov w3,#0x58
00a7d224	mov x0,x22
00a7d228	mov x1,x21
00a7d22c	bl 0x00c345f0
00a7d230	str x0,[x23]
00a7d234	cbz x0,0x00a7d24c
00a7d238	str x21,[x20, #0x28]
00a7d23c	b 0x00a7d244
00a7d240	stp xzr,xzr,[x23]
00a7d244	mov w0,#0x1
00a7d248	str w19,[x20, #0x30]
00a7d24c	ldp x29,x30,[sp, #0x30]
00a7d250	ldp x20,x19,[sp, #0x20]
00a7d254	ldp x22,x21,[sp, #0x10]
00a7d258	ldr x23,[sp], #0x40
00a7d25c	ret
