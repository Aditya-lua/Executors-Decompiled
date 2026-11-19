; std::__ndk1::__shared_weak_count::__release_weak @ 00bc3100
00bc3100	paciasp
00bc3104	stp x29,x30,[sp, #-0x20]!
00bc3108	str x19,[sp, #0x10]
00bc310c	mov x29,sp
00bc3110	add x1,x0,#0x10
00bc3114	mov x19,x0
00bc3118	ldar x8,[x1]
00bc311c	cbz x8,0x00bc313c
00bc3120	mov x0,#-0x1
00bc3124	bl 0x00c2bd10
00bc3128	cbz x0,0x00bc313c
00bc312c	ldr x19,[sp, #0x10]
00bc3130	ldp x29,x30,[sp], #0x20
00bc3134	autiasp
00bc3138	ret
00bc313c	ldr x8,[x19]
00bc3140	ldr x16,[x8, #0x20]
00bc3144	mov x0,x19
00bc3148	ldr x19,[sp, #0x10]
00bc314c	ldp x29,x30,[sp], #0x20
00bc3150	autiasp
00bc3154	br x16
