; FUN_00a72b98 @ 00a72b98
00a72b98	sub sp,sp,#0x80
00a72b9c	stp x22,x21,[sp, #0x50]
00a72ba0	stp x20,x19,[sp, #0x60]
00a72ba4	stp x29,x30,[sp, #0x70]
00a72ba8	ldr x8,[x2, #0x20]
00a72bac	mov w21,w0
00a72bb0	add x29,sp,#0x70
00a72bb4	mov x19,x2
00a72bb8	mov x0,x8
00a72bbc	mov x20,x1
00a72bc0	bl 0x00c37cd0
00a72bc4	cmp w0,#0x6
00a72bc8	b.eq 0x00a72be0
00a72bcc	ldr x0,[x19, #0x20]
00a72bd0	bl 0x00c37cd0
00a72bd4	cmp w0,#0x390
00a72bd8	mov w0,wzr
00a72bdc	b.ne 0x00a72c40
00a72be0	ldr x0,[x19, #0x20]
00a72be4	bl 0x00c3d8d0
00a72be8	mov x22,x0
00a72bec	bl 0x00c3db80
00a72bf0	cmp w0,#0x6
00a72bf4	b.cc 0x00a72c3c
00a72bf8	mov x1,sp
00a72bfc	mov x0,x22
00a72c00	bl 0x00c3db40
00a72c04	cbz w0,0x00a72c3c
00a72c08	ldr x8,[sp, #0x28]
00a72c0c	cbz x8,0x00a72c3c
00a72c10	ldr x9,[x19, #0x30]
00a72c14	mov w0,wzr
00a72c18	ldr w9,[x9, #0x8]
00a72c1c	cmp w9,#0x2
00a72c20	b.ne 0x00a72c40
00a72c24	mov w0,w21
00a72c28	mov x1,x20
00a72c2c	mov x2,x19
00a72c30	str x8,[x19, #0x20]
00a72c34	bl 0x00a6fd84
00a72c38	b 0x00a72c40
00a72c3c	mov w0,wzr
00a72c40	ldp x29,x30,[sp, #0x70]
00a72c44	ldp x20,x19,[sp, #0x60]
00a72c48	ldp x22,x21,[sp, #0x50]
00a72c4c	add sp,sp,#0x80
00a72c50	ret
