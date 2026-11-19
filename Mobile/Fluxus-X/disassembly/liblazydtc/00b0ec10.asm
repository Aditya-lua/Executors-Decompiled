; X509_gmtime_adj @ 00b0ec10
00b0ec10	sub sp,sp,#0x30
00b0ec14	stp x20,x19,[sp, #0x10]
00b0ec18	mov x20,x0
00b0ec1c	add x0,sp,#0x8
00b0ec20	stp x29,x30,[sp, #0x20]
00b0ec24	add x29,sp,#0x20
00b0ec28	mov x19,x1
00b0ec2c	bl 0x00c30970
00b0ec30	cbz x20,0x00b0ec68
00b0ec34	ldrb w8,[x20, #0x10]
00b0ec38	tbnz w8,#0x6,0x00b0ec68
00b0ec3c	ldr w8,[x20, #0x4]
00b0ec40	cmp w8,#0x18
00b0ec44	b.eq 0x00b0ec8c
00b0ec48	cmp w8,#0x17
00b0ec4c	b.ne 0x00b0ec68
00b0ec50	ldr x1,[sp, #0x8]
00b0ec54	mov x0,x20
00b0ec58	mov w2,wzr
00b0ec5c	mov x3,x19
00b0ec60	bl 0x00c37ad0
00b0ec64	b 0x00b0ec7c
00b0ec68	ldr x1,[sp, #0x8]
00b0ec6c	mov x0,x20
00b0ec70	mov w2,wzr
00b0ec74	mov x3,x19
00b0ec78	bl 0x00c378f0
00b0ec7c	ldp x29,x30,[sp, #0x20]
00b0ec80	ldp x20,x19,[sp, #0x10]
00b0ec84	add sp,sp,#0x30
00b0ec88	ret
00b0ec8c	ldr x1,[sp, #0x8]
00b0ec90	mov x0,x20
00b0ec94	mov w2,wzr
00b0ec98	mov x3,x19
00b0ec9c	bl 0x00c374b0
00b0eca0	b 0x00b0ec7c
