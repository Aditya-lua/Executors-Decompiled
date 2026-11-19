; FUN_00a81bbc @ 00a81bbc
00a81bbc	sub sp,sp,#0x40
00a81bc0	stp x22,x21,[sp, #0x10]
00a81bc4	stp x20,x19,[sp, #0x20]
00a81bc8	stp x29,x30,[sp, #0x30]
00a81bcc	mov x22,x0
00a81bd0	ldr x0,[x0]
00a81bd4	mov x20,x2
00a81bd8	adrp x2,0xc61000
00a81bdc	mov x21,x1
00a81be0	add x2,x2,#0x408
00a81be4	mov w1,#0x11
00a81be8	add x29,sp,#0x30
00a81bec	mov x19,x3
00a81bf0	bl 0x00c3b520
00a81bf4	cbz x0,0x00a81c30
00a81bf8	ldr x0,[x0]
00a81bfc	cbz x0,0x00a81c30
00a81c00	str x0,[sp, #0x8]
00a81c04	mov x0,x22
00a81c08	bl 0x00c321b0
00a81c0c	mov x1,x21
00a81c10	mov x2,x20
00a81c14	mov x3,x19
00a81c18	ldr x4,[sp, #0x8]
00a81c1c	ldp x29,x30,[sp, #0x30]
00a81c20	ldp x20,x19,[sp, #0x20]
00a81c24	ldp x22,x21,[sp, #0x10]
00a81c28	add sp,sp,#0x40
00a81c2c	br x4
00a81c30	ldp x29,x30,[sp, #0x30]
00a81c34	ldp x20,x19,[sp, #0x20]
00a81c38	ldp x22,x21,[sp, #0x10]
00a81c3c	mov w0,wzr
00a81c40	add sp,sp,#0x40
00a81c44	ret
