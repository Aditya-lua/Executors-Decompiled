; ossl_rsa_pss_get_param_unverified @ 00acfbc0
00acfbc0	sub sp,sp,#0x60
00acfbc4	stp x22,x21,[sp, #0x30]
00acfbc8	mov x21,x0
00acfbcc	add x0,sp,#0x8
00acfbd0	str x23,[sp, #0x20]
00acfbd4	stp x20,x19,[sp, #0x40]
00acfbd8	stp x29,x30,[sp, #0x50]
00acfbdc	add x29,sp,#0x50
00acfbe0	mov x19,x4
00acfbe4	mov x20,x3
00acfbe8	mov x22,x2
00acfbec	mov x23,x1
00acfbf0	bl 0x00c3fbb0
00acfbf4	cbz x21,0x00acfc28
00acfbf8	ldr x0,[x21]
00acfbfc	bl 0x00c38270
00acfc00	str x0,[x23]
00acfc04	cbz x0,0x00acfc5c
00acfc08	ldr x0,[x21, #0x20]
00acfc0c	bl 0x00c38270
00acfc10	str x0,[x22]
00acfc14	cbz x0,0x00acfc5c
00acfc18	ldr x0,[x21, #0x10]
00acfc1c	cbz x0,0x00acfc30
00acfc20	bl 0x00c37580
00acfc24	b 0x00acfc38
00acfc28	mov w0,wzr
00acfc2c	b 0x00acfc5c
00acfc30	add x0,sp,#0x8
00acfc34	bl 0x00c3fba0
00acfc38	str w0,[x20]
00acfc3c	ldr x0,[x21, #0x18]
00acfc40	cbz x0,0x00acfc4c
00acfc44	bl 0x00c37580
00acfc48	b 0x00acfc54
00acfc4c	add x0,sp,#0x8
00acfc50	bl 0x00c3fd30
00acfc54	str w0,[x19]
00acfc58	mov w0,#0x1
00acfc5c	ldp x29,x30,[sp, #0x50]
00acfc60	ldp x20,x19,[sp, #0x40]
00acfc64	ldp x22,x21,[sp, #0x30]
00acfc68	ldr x23,[sp, #0x20]
00acfc6c	add sp,sp,#0x60
00acfc70	ret
