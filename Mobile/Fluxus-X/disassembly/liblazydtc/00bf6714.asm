; FUN_00bf6714 @ 00bf6714
00bf6714	paciasp
00bf6718	sub sp,sp,#0x50
00bf671c	stp x29,x30,[sp, #0x20]
00bf6720	stp x22,x21,[sp, #0x30]
00bf6724	stp x20,x19,[sp, #0x40]
00bf6728	add x29,sp,#0x20
00bf672c	adrp x20,0xcb5000
00bf6730	mov x19,x1
00bf6734	mov x21,x0
00bf6738	ldr x20,[x20, #0xc10]
00bf673c	str x20,[sp, #0x8]
00bf6740	ldar x8,[x20]
00bf6744	cmn x8,#0x1
00bf6748	b.eq 0x00bf6774
00bf674c	add x8,sp,#0x8
00bf6750	sub x9,x29,#0x8
00bf6754	adrp x0,0xcb5000
00bf6758	stur x8,[x29, #-0x8]
00bf675c	nop
00bf6760	adr x2,0xc0bab0
00bf6764	str x9,[sp, #0x10]
00bf6768	add x1,sp,#0x10
00bf676c	ldr x0,[x0, #0xc10]
00bf6770	bl 0x00c305d0
00bf6774	ldrsw x8,[x20, #0x8]
00bf6778	add x1,x19,#0x8
00bf677c	mov w0,#0x1
00bf6780	sub x22,x8,#0x1
00bf6784	bl 0x00c2bce0
00bf6788	mov x20,x21
00bf678c	ldp x8,x9,[x20, #0x10]!
00bf6790	sub x9,x9,x8
00bf6794	asr x10,x9,#0x3
00bf6798	cmp x10,x22
00bf679c	b.hi 0x00bf67c8
00bf67a0	add x9,x22,#0x1
00bf67a4	subs x1,x9,x10
00bf67a8	b.ls 0x00bf67bc
00bf67ac	mov x0,x20
00bf67b0	bl 0x00c0b6e4
00bf67b4	ldr x8,[x20]
00bf67b8	b 0x00bf67c8
00bf67bc	b.cs 0x00bf67c8
00bf67c0	add x9,x8,x9, LSL #0x3
00bf67c4	str x9,[x21, #0x18]
00bf67c8	ldr x21,[x8, x22, LSL #0x3]
00bf67cc	cbz x21,0x00bf67f0
00bf67d0	add x1,x21,#0x8
00bf67d4	mov x0,#-0x1
00bf67d8	bl 0x00c2bd10
00bf67dc	cbnz x0,0x00bf67f0
00bf67e0	ldr x8,[x21]
00bf67e4	mov x0,x21
00bf67e8	ldr x8,[x8, #0x10]
00bf67ec	blr x8
00bf67f0	ldr x8,[x20]
00bf67f4	str x19,[x8, x22, LSL #0x3]
00bf67f8	ldp x20,x19,[sp, #0x40]
00bf67fc	ldp x22,x21,[sp, #0x30]
00bf6800	ldp x29,x30,[sp, #0x20]
00bf6804	add sp,sp,#0x50
00bf6808	autiasp
00bf680c	ret
