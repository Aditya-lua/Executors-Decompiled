; FUN_00850c60 @ 00850c60
00850c60	stp x29,x30,[sp, #-0x30]!
00850c64	stp x22,x21,[sp, #0x10]
00850c68	stp x20,x19,[sp, #0x20]
00850c6c	mov x29,sp
00850c70	ldr x8,[x1]
00850c74	mov x20,x0
00850c78	mov x19,x1
00850c7c	mov x0,x1
00850c80	mov x1,x20
00850c84	ldr x8,[x8, #0x1a0]
00850c88	blr x8
00850c8c	tbz w0,#0x0,0x00850d04
00850c90	ldr x8,[x20, #0x28]
00850c94	cbz x8,0x00850cc4
00850c98	lsl x9,x8,#0x6
00850c9c	ldr x10,[x20, #0x20]
00850ca0	sub x21,x9,x8, LSL #0x3
00850ca4	add x22,x10,#0x18
00850ca8	ldr x0,[x22], #0x38
00850cac	mov x1,x19
00850cb0	ldr x8,[x0]
00850cb4	ldr x8,[x8]
00850cb8	blr x8
00850cbc	subs x21,x21,#0x38
00850cc0	b.ne 0x00850ca8
00850cc4	ldr x8,[x20, #0x30]
00850cc8	cbz x8,0x00850d04
00850ccc	ldr x0,[x8]
00850cd0	mov x1,x19
00850cd4	ldr x8,[x0]
00850cd8	ldr x8,[x8]
00850cdc	blr x8
00850ce0	ldr x8,[x20, #0x30]
00850ce4	ldr x0,[x8, #0x8]
00850ce8	ldr x8,[x0]
00850cec	ldr x2,[x8]
00850cf0	mov x1,x19
00850cf4	ldp x20,x19,[sp, #0x20]
00850cf8	ldp x22,x21,[sp, #0x10]
00850cfc	ldp x29,x30,[sp], #0x30
00850d00	br x2
00850d04	ldp x20,x19,[sp, #0x20]
00850d08	ldp x22,x21,[sp, #0x10]
00850d0c	ldp x29,x30,[sp], #0x30
00850d10	ret
