; PKCS12_SAFEBAG_get_bag_nid @ 00abc7d4
00abc7d4	str x19,[sp, #-0x20]!
00abc7d8	stp x29,x30,[sp, #0x10]
00abc7dc	mov x19,x0
00abc7e0	ldr x0,[x0]
00abc7e4	add x29,sp,#0x10
00abc7e8	bl 0x00c37750
00abc7ec	sub w8,w0,#0x98
00abc7f0	cmp w8,#0x2
00abc7f4	b.hi 0x00abc80c
00abc7f8	ldr x8,[x19, #0x8]
00abc7fc	ldp x29,x30,[sp, #0x10]
00abc800	ldr x0,[x8]
00abc804	ldr x19,[sp], #0x20
00abc808	b 0x00c37750
00abc80c	ldp x29,x30,[sp, #0x10]
00abc810	mov w0,#0xffffffff
00abc814	ldr x19,[sp], #0x20
00abc818	ret
