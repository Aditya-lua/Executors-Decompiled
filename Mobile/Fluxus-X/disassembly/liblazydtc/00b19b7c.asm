; FUN_00b19b7c @ 00b19b7c
00b19b7c	stp x22,x21,[sp, #-0x30]!
00b19b80	stp x20,x19,[sp, #0x10]
00b19b84	stp x29,x30,[sp, #0x20]
00b19b88	mov x21,x1
00b19b8c	ldr x1,[x0, #0x40]
00b19b90	mov w22,w2
00b19b94	mov x19,x0
00b19b98	mov w20,wzr
00b19b9c	ldr w8,[x1]
00b19ba0	add x29,sp,#0x20
00b19ba4	cmp w8,#0x5
00b19ba8	b.eq 0x00b19bc0
00b19bac	mov x0,x19
00b19bb0	bl 0x00b1a170
00b19bb4	mov w20,w0
00b19bb8	cmp w0,#0x1
00b19bbc	b.lt 0x00b19c20
00b19bc0	cbz x21,0x00b19c20
00b19bc4	bl 0x00c30710
00b19bc8	str wzr,[x0]
00b19bcc	ldr w0,[x19, #0x38]
00b19bd0	sxtw x2,w22
00b19bd4	mov x1,x21
00b19bd8	bl 0x00c31ef0
00b19bdc	mov x20,x0
00b19be0	orr w1,wzr,#0xf
00b19be4	mov x0,x19
00b19be8	bl 0x00c32190
00b19bec	cmp w20,#0x0
00b19bf0	b.gt 0x00b19c20
00b19bf4	mov w0,w20
00b19bf8	bl 0x00c38770
00b19bfc	cbz w0,0x00b19c10
00b19c00	mov w1,#0x9
00b19c04	mov x0,x19
00b19c08	bl 0x00c322a0
00b19c0c	b 0x00b19c20
00b19c10	cbnz w20,0x00b19c20
00b19c14	ldr w8,[x19, #0x30]
00b19c18	orr w8,w8,#0x800
00b19c1c	str w8,[x19, #0x30]
00b19c20	mov w0,w20
00b19c24	ldp x29,x30,[sp, #0x20]
00b19c28	ldp x20,x19,[sp, #0x10]
00b19c2c	ldp x22,x21,[sp], #0x30
00b19c30	ret
