; FUN_00873ba0 @ 00873ba0
00873ba0	stp x29,x30,[sp, #-0x20]!
00873ba4	str x19,[sp, #0x10]
00873ba8	mov x29,sp
00873bac	mov x19,x0
00873bb0	ldr x0,[x0]
00873bb4	cbz x0,0x00873be4
00873bb8	bl 0x00c301d0
00873bbc	ldr x0,[x19, #0x18]
00873bc0	str xzr,[x19]
00873bc4	bl 0x00c301d0
00873bc8	mov x0,xzr
00873bcc	stp xzr,xzr,[x19, #0x8]
00873bd0	str xzr,[x19, #0x18]
00873bd4	bl 0x00c301d0
00873bd8	mov w8,#0x40
00873bdc	str xzr,[x19, #0x20]
00873be0	strb w8,[x19, #0x30]
00873be4	ldr x0,[x19, #0x18]
00873be8	ldr x19,[sp, #0x10]
00873bec	ldp x29,x30,[sp], #0x20
00873bf0	b 0x00c301d0
