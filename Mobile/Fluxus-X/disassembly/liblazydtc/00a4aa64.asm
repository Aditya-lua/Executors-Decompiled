; gf_lobit @ 00a4aa64
00a4aa64	sub sp,sp,#0x50
00a4aa68	stp x29,x30,[sp, #0x40]
00a4aa6c	ldr q0,[x0, #0x30]
00a4aa70	add x29,sp,#0x40
00a4aa74	str q0,[sp, #0x30]
00a4aa78	ldr q0,[x0, #0x20]
00a4aa7c	str q0,[sp, #0x20]
00a4aa80	ldr q0,[x0, #0x10]
00a4aa84	str q0,[sp, #0x10]
00a4aa88	ldr q0,[x0]
00a4aa8c	mov x0,sp
00a4aa90	str q0,[sp]
00a4aa94	bl 0x00a4a620
00a4aa98	ldr x8,[sp]
00a4aa9c	ldp x29,x30,[sp, #0x40]
00a4aaa0	and x8,x8,#0x1
00a4aaa4	neg x0,x8
00a4aaa8	add sp,sp,#0x50
00a4aaac	ret
