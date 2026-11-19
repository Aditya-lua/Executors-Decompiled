; mbedtls_cipher_write_tag @ 00b6aaa8
00b6aaa8	sub sp,sp,#0x30
00b6aaac	str x19,[sp, #0x10]
00b6aab0	stp x29,x30,[sp, #0x20]
00b6aab4	add x29,sp,#0x20
00b6aab8	mrs x19,tpidr_el0
00b6aabc	ldr x8,[x19, #0x28]
00b6aac0	mov x5,x2
00b6aac4	mov x4,x1
00b6aac8	str x8,[sp, #0x8]
00b6aacc	ldr x8,[x0]
00b6aad0	cbz x8,0x00b6ab2c
00b6aad4	ldr w9,[x0, #0xc]
00b6aad8	cmp w9,#0x1
00b6aadc	b.ne 0x00b6ab2c
00b6aae0	ldr w8,[x8, #0x8]
00b6aae4	and w9,w8,#0xf000
00b6aae8	cmp w9,#0x6, LSL #12
00b6aaec	b.ne 0x00b6ab08
00b6aaf0	ldr x0,[x0, #0x50]
00b6aaf4	mov x3,sp
00b6aaf8	mov x1,xzr
00b6aafc	mov x2,xzr
00b6ab00	bl 0x00c421c0
00b6ab04	b 0x00b6ab30
00b6ab08	and w8,w8,#0xff0000
00b6ab0c	cmp w8,#0x4d0, LSL #12
00b6ab10	b.ne 0x00b6ab50
00b6ab14	cmp x5,#0x10
00b6ab18	b.ne 0x00b6ab2c
00b6ab1c	ldr x0,[x0, #0x50]
00b6ab20	mov x1,x4
00b6ab24	bl 0x00c420e0
00b6ab28	b 0x00b6ab30
00b6ab2c	mov w0,#0xffff9f00
00b6ab30	ldr x8,[x19, #0x28]
00b6ab34	ldr x9,[sp, #0x8]
00b6ab38	cmp x8,x9
00b6ab3c	b.ne 0x00b6ab58
00b6ab40	ldp x29,x30,[sp, #0x20]
00b6ab44	ldr x19,[sp, #0x10]
00b6ab48	add sp,sp,#0x30
00b6ab4c	ret
00b6ab50	mov w0,#0xffff9f80
00b6ab54	b 0x00b6ab30
00b6ab58	bl 0x00c2fec0
