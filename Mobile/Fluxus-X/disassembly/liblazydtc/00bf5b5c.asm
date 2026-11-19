; FUN_00bf5b5c @ 00bf5b5c
00bf5b5c	paciasp
00bf5b60	sub sp,sp,#0x50
00bf5b64	stp x29,x30,[sp, #0x20]
00bf5b68	stp x22,x21,[sp, #0x30]
00bf5b6c	stp x20,x19,[sp, #0x40]
00bf5b70	add x29,sp,#0x20
00bf5b74	adrp x20,0xcb5000
00bf5b78	mov x19,x1
00bf5b7c	mov x21,x0
00bf5b80	ldr x20,[x20, #0xc50]
00bf5b84	str x20,[sp, #0x8]
00bf5b88	ldar x8,[x20]
00bf5b8c	cmn x8,#0x1
00bf5b90	b.eq 0x00bf5bbc
00bf5b94	add x8,sp,#0x8
00bf5b98	sub x9,x29,#0x8
00bf5b9c	adrp x0,0xcb5000
00bf5ba0	stur x8,[x29, #-0x8]
00bf5ba4	nop
00bf5ba8	adr x2,0xc0bab0
00bf5bac	str x9,[sp, #0x10]
00bf5bb0	add x1,sp,#0x10
00bf5bb4	ldr x0,[x0, #0xc50]
00bf5bb8	bl 0x00c305d0
00bf5bbc	ldrsw x8,[x20, #0x8]
00bf5bc0	add x1,x19,#0x8
00bf5bc4	mov w0,#0x1
00bf5bc8	sub x22,x8,#0x1
00bf5bcc	bl 0x00c2bce0
00bf5bd0	mov x20,x21
00bf5bd4	ldp x8,x9,[x20, #0x10]!
00bf5bd8	sub x9,x9,x8
00bf5bdc	asr x10,x9,#0x3
00bf5be0	cmp x10,x22
00bf5be4	b.hi 0x00bf5c10
00bf5be8	add x9,x22,#0x1
00bf5bec	subs x1,x9,x10
00bf5bf0	b.ls 0x00bf5c04
00bf5bf4	mov x0,x20
00bf5bf8	bl 0x00c0b6e4
00bf5bfc	ldr x8,[x20]
00bf5c00	b 0x00bf5c10
00bf5c04	b.cs 0x00bf5c10
00bf5c08	add x9,x8,x9, LSL #0x3
00bf5c0c	str x9,[x21, #0x18]
00bf5c10	ldr x21,[x8, x22, LSL #0x3]
00bf5c14	cbz x21,0x00bf5c38
00bf5c18	add x1,x21,#0x8
00bf5c1c	mov x0,#-0x1
00bf5c20	bl 0x00c2bd10
00bf5c24	cbnz x0,0x00bf5c38
00bf5c28	ldr x8,[x21]
00bf5c2c	mov x0,x21
00bf5c30	ldr x8,[x8, #0x10]
00bf5c34	blr x8
00bf5c38	ldr x8,[x20]
00bf5c3c	str x19,[x8, x22, LSL #0x3]
00bf5c40	ldp x20,x19,[sp, #0x40]
00bf5c44	ldp x22,x21,[sp, #0x30]
00bf5c48	ldp x29,x30,[sp, #0x20]
00bf5c4c	add sp,sp,#0x50
00bf5c50	autiasp
00bf5c54	ret
