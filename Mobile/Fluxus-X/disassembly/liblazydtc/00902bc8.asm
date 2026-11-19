; curl_easy_reset @ 00902bc8
00902bc8	str x19,[sp, #-0x20]!
00902bcc	stp x29,x30,[sp, #0x10]
00902bd0	add x29,sp,#0x10
00902bd4	mov x19,x0
00902bd8	add x0,x0,#0xd8
00902bdc	mov x1,x19
00902be0	bl 0x00932998
00902be4	mov x0,x19
00902be8	bl 0x00946444
00902bec	add x0,x19,#0x1b8
00902bf0	mov w2,#0x8d8
00902bf4	mov w1,wzr
00902bf8	bl 0x00c301c0
00902bfc	mov x0,x19
00902c00	bl 0x0094690c
00902c04	add x0,x19,#0xaa8
00902c08	mov w2,#0x190
00902c0c	mov w1,wzr
00902c10	bl 0x00c301c0
00902c14	mov x0,x19
00902c18	bl 0x00915c9c
00902c1c	ldr w8,[x19, #0xadc]
00902c20	mov x9,#-0x1
00902c24	str wzr,[x19, #0xca0]
00902c28	str xzr,[x19, #0xd88]
00902c2c	orr w8,w8,#0x10
00902c30	str xzr,[x19, #0xd80]
00902c34	str xzr,[x19, #0xd78]
00902c38	str xzr,[x19, #0xd70]
00902c3c	str xzr,[x19, #0xd68]
00902c40	str xzr,[x19, #0xd60]
00902c44	str xzr,[x19, #0xd58]
00902c48	str x9,[x19, #0xc88]
00902c4c	str w8,[x19, #0xadc]
00902c50	str xzr,[x19, #0xd50]
00902c54	ldp x29,x30,[sp, #0x10]
00902c58	mov x0,x19
00902c5c	ldr x19,[sp], #0x20
00902c60	b 0x00924ca4
