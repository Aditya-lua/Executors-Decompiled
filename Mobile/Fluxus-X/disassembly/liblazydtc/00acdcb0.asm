; FUN_00acdcb0 @ 00acdcb0
00acdcb0	stp x20,x19,[sp, #-0x20]!
00acdcb4	stp x29,x30,[sp, #0x10]
00acdcb8	mov x19,x0
00acdcbc	ldr x0,[x0, #0x20]
00acdcc0	add x29,sp,#0x10
00acdcc4	mov x20,x1
00acdcc8	bl 0x00c326c0
00acdccc	tbnz w0,#0x0,0x00acdd1c
00acdcd0	ldr x0,[x20, #0x20]
00acdcd4	bl 0x00c326c0
00acdcd8	tbnz w0,#0x0,0x00acdd1c
00acdcdc	ldr x8,[x20, #0x20]
00acdce0	ldr x9,[x19, #0x20]
00acdce4	ldr x0,[x8, #0x28]
00acdce8	ldr x1,[x9, #0x28]
00acdcec	bl 0x00c38cc0
00acdcf0	mov w8,w0
00acdcf4	mov w0,wzr
00acdcf8	cbnz w8,0x00acdd20
00acdcfc	ldr x8,[x20, #0x20]
00acdd00	ldr x9,[x19, #0x20]
00acdd04	ldr x0,[x8, #0x30]
00acdd08	ldr x1,[x9, #0x30]
00acdd0c	bl 0x00c38cc0
00acdd10	cmp w0,#0x0
00acdd14	cset w0,eq
00acdd18	b 0x00acdd20
00acdd1c	mov w0,#0x1
00acdd20	ldp x29,x30,[sp, #0x10]
00acdd24	ldp x20,x19,[sp], #0x20
00acdd28	ret
