; X509_ALGOR_set_md @ 009f836c
009f836c	stp x22,x21,[sp, #-0x30]!
009f8370	stp x20,x19,[sp, #0x10]
009f8374	stp x29,x30,[sp, #0x20]
009f8378	ldr x22,[x1, #0x10]
009f837c	mov x19,x0
009f8380	mov w8,#0x5
009f8384	mov x0,x1
009f8388	tst x22,#0x8
009f838c	add x29,sp,#0x20
009f8390	csinv w20,w8,wzr,eq
009f8394	bl 0x00c34c30
009f8398	bl 0x00c37740
009f839c	cbz x19,0x009f83f0
009f83a0	mov x21,x0
009f83a4	tbnz w22,#0x3,0x009f83bc
009f83a8	ldr x8,[x19, #0x8]
009f83ac	cbnz x8,0x009f83bc
009f83b0	bl 0x00c37a40
009f83b4	str x0,[x19, #0x8]
009f83b8	cbz x0,0x009f83f0
009f83bc	ldr x0,[x19]
009f83c0	bl 0x00c37660
009f83c4	ldr x0,[x19, #0x8]
009f83c8	str x21,[x19]
009f83cc	tbnz w22,#0x3,0x009f83e8
009f83d0	mov w1,w20
009f83d4	ldp x29,x30,[sp, #0x20]
009f83d8	ldp x20,x19,[sp, #0x10]
009f83dc	mov x2,xzr
009f83e0	ldp x22,x21,[sp], #0x30
009f83e4	b 0x00c37a60
009f83e8	bl 0x00c37cc0
009f83ec	str xzr,[x19, #0x8]
009f83f0	ldp x29,x30,[sp, #0x20]
009f83f4	ldp x20,x19,[sp, #0x10]
009f83f8	ldp x22,x21,[sp], #0x30
009f83fc	ret
