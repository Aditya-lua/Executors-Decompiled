; std::__ndk1::__shared_count::__release_shared @ 00bc2fec
00bc2fec	paciasp
00bc2ff0	stp x29,x30,[sp, #-0x20]!
00bc2ff4	stp x20,x19,[sp, #0x10]
00bc2ff8	mov x29,sp
00bc2ffc	mov x19,x0
00bc3000	add x1,x0,#0x8
00bc3004	mov x0,#-0x1
00bc3008	bl 0x00c2bd10
00bc300c	mov x20,x0
00bc3010	cbnz x0,0x00bc3024
00bc3014	ldr x8,[x19]
00bc3018	mov x0,x19
00bc301c	ldr x8,[x8, #0x10]
00bc3020	blr x8
00bc3024	cmp x20,#0x0
00bc3028	cset w0,eq
00bc302c	ldp x20,x19,[sp, #0x10]
00bc3030	ldp x29,x30,[sp], #0x20
00bc3034	autiasp
00bc3038	ret
