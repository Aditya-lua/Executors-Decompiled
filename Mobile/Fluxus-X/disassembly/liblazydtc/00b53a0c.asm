; CMAC_CTX_copy @ 00b53a0c
00b53a0c	str x21,[sp, #-0x30]!
00b53a10	stp x20,x19,[sp, #0x10]
00b53a14	stp x29,x30,[sp, #0x20]
00b53a18	ldr w8,[x1, #0x88]
00b53a1c	add x29,sp,#0x20
00b53a20	cmn w8,#0x1
00b53a24	b.eq 0x00b53aa4
00b53a28	mov x20,x0
00b53a2c	ldr x0,[x1]
00b53a30	mov x19,x1
00b53a34	bl 0x00c36d40
00b53a38	mov w21,w0
00b53a3c	tbnz w0,#0x1f,0x00b53aa4
00b53a40	ldr x0,[x20]
00b53a44	ldr x1,[x19]
00b53a48	bl 0x00c3cc90
00b53a4c	cbz w0,0x00b53aa8
00b53a50	sxtw x21,w21
00b53a54	add x0,x20,#0x8
00b53a58	add x1,x19,#0x8
00b53a5c	mov x2,x21
00b53a60	bl 0x00c2ffd0
00b53a64	add x0,x20,#0x28
00b53a68	add x1,x19,#0x28
00b53a6c	mov x2,x21
00b53a70	bl 0x00c2ffd0
00b53a74	add x0,x20,#0x48
00b53a78	add x1,x19,#0x48
00b53a7c	mov x2,x21
00b53a80	bl 0x00c2ffd0
00b53a84	add x0,x20,#0x68
00b53a88	add x1,x19,#0x68
00b53a8c	mov x2,x21
00b53a90	bl 0x00c2ffd0
00b53a94	ldr w8,[x19, #0x88]
00b53a98	mov w0,#0x1
00b53a9c	str w8,[x20, #0x88]
00b53aa0	b 0x00b53aa8
00b53aa4	mov w0,wzr
00b53aa8	ldp x29,x30,[sp, #0x20]
00b53aac	ldp x20,x19,[sp, #0x10]
00b53ab0	ldr x21,[sp], #0x30
00b53ab4	ret
