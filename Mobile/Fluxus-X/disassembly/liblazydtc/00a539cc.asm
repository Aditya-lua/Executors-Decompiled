; ENGINE_register_all_pkey_meths @ 00a539cc
00a539cc	str x21,[sp, #-0x30]!
00a539d0	stp x20,x19,[sp, #0x10]
00a539d4	stp x29,x30,[sp, #0x20]
00a539d8	add x29,sp,#0x20
00a539dc	bl 0x00c32380
00a539e0	cbz x0,0x00a53a48
00a539e4	adrp x20,0xd21000
00a539e8	adrp x21,0xa53000
00a539ec	mov x19,x0
00a539f0	add x20,x20,#0xa00
00a539f4	add x21,x21,#0x9c0
00a539f8	ldr x8,[x19, #0x48]
00a539fc	cbz x8,0x00a53a38
00a53a00	add x2,sp,#0x8
00a53a04	mov x0,x19
00a53a08	mov x1,xzr
00a53a0c	mov w3,wzr
00a53a10	blr x8
00a53a14	cmp w0,#0x0
00a53a18	b.le 0x00a53a38
00a53a1c	ldr x3,[sp, #0x8]
00a53a20	mov w4,w0
00a53a24	mov x0,x20
00a53a28	mov x1,x21
00a53a2c	mov x2,x19
00a53a30	mov w5,wzr
00a53a34	bl 0x00c3bce0
00a53a38	mov x0,x19
00a53a3c	bl 0x00c323a0
00a53a40	mov x19,x0
00a53a44	cbnz x0,0x00a539f8
00a53a48	ldp x29,x30,[sp, #0x20]
00a53a4c	ldp x20,x19,[sp, #0x10]
00a53a50	ldr x21,[sp], #0x30
00a53a54	ret
