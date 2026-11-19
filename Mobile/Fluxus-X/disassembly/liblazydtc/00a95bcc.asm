; FUN_00a95bcc @ 00a95bcc
00a95bcc	sub sp,sp,#0x110
00a95bd0	stp x20,x19,[sp, #0xf0]
00a95bd4	mov x19,x1
00a95bd8	mov x20,x0
00a95bdc	str x28,[sp, #0xe0]
00a95be0	stp x29,x30,[sp, #0x100]
00a95be4	add x29,sp,#0x100
00a95be8	cbnz w3,0x00a95c14
00a95bec	mov x0,x20
00a95bf0	bl 0x00c34b80
00a95bf4	bl 0x00c35290
00a95bf8	cmp w0,#0x4
00a95bfc	b.eq 0x00a95c14
00a95c00	mov x0,x20
00a95c04	bl 0x00c34b80
00a95c08	bl 0x00c35290
00a95c0c	cmp w0,#0x3
00a95c10	b.ne 0x00a95c40
00a95c14	mov x0,x20
00a95c18	bl 0x00c3cea0
00a95c1c	mov x1,x0
00a95c20	mov x0,x19
00a95c24	bl 0x00c3de00
00a95c28	ldp x29,x30,[sp, #0x100]
00a95c2c	ldp x20,x19,[sp, #0xf0]
00a95c30	ldr x28,[sp, #0xe0]
00a95c34	mov w0,#0x1
00a95c38	add sp,sp,#0x110
00a95c3c	ret
00a95c40	add x1,sp,#0x8
00a95c44	mov x0,x19
00a95c48	bl 0x00c3de00
00a95c4c	mov x0,x20
00a95c50	bl 0x00c3cea0
00a95c54	mov x1,x0
00a95c58	add x0,sp,#0x8
00a95c5c	bl 0x00c3ddf0
00a95c60	add x0,sp,#0x8
00a95c64	mov w1,#0xd8
00a95c68	bl 0x00c34750
00a95c6c	b 0x00a95c28
