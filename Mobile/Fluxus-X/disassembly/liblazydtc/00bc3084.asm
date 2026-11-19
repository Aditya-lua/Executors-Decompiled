; std::__ndk1::__shared_weak_count::__release_shared @ 00bc3084
00bc3084	paciasp
00bc3088	stp x29,x30,[sp, #-0x20]!
00bc308c	stp x20,x19,[sp, #0x10]
00bc3090	mov x29,sp
00bc3094	mov x19,x0
00bc3098	add x1,x0,#0x8
00bc309c	mov x0,#-0x1
00bc30a0	bl 0x00c2bd10
00bc30a4	cbz x0,0x00bc30b8
00bc30a8	ldp x20,x19,[sp, #0x10]
00bc30ac	ldp x29,x30,[sp], #0x20
00bc30b0	autiasp
00bc30b4	ret
00bc30b8	mov x20,x19
00bc30bc	mov x0,x19
00bc30c0	ldr x8,[x20], #0x10
00bc30c4	ldr x8,[x8, #0x10]
00bc30c8	blr x8
00bc30cc	ldar x8,[x20]
00bc30d0	cbz x8,0x00bc30e4
00bc30d4	add x1,x19,#0x10
00bc30d8	mov x0,#-0x1
00bc30dc	bl 0x00c2bd10
00bc30e0	cbnz x0,0x00bc30a8
00bc30e4	ldr x8,[x19]
00bc30e8	ldr x16,[x8, #0x20]
00bc30ec	mov x0,x19
00bc30f0	ldp x20,x19,[sp, #0x10]
00bc30f4	ldp x29,x30,[sp], #0x20
00bc30f8	autiasp
00bc30fc	br x16
