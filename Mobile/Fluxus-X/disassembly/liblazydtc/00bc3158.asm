; std::__ndk1::__shared_weak_count::lock @ 00bc3158
00bc3158	paciasp
00bc315c	stp x29,x30,[sp, #-0x20]!
00bc3160	stp x20,x19,[sp, #0x10]
00bc3164	mov x29,sp
00bc3168	add x8,x0,#0x8
00bc316c	ldar x20,[x8]
00bc3170	cmn x20,#0x1
00bc3174	b.eq 0x00bc31a0
00bc3178	mov x19,x0
00bc317c	add x1,x20,#0x1
00bc3180	add x2,x19,#0x8
00bc3184	mov x0,x20
00bc3188	bl 0x00c2bc40
00bc318c	cmp x0,x20
00bc3190	b.eq 0x00bc31a4
00bc3194	cmn x0,#0x1
00bc3198	mov x20,x0
00bc319c	b.ne 0x00bc317c
00bc31a0	mov x19,xzr
00bc31a4	mov x0,x19
00bc31a8	ldp x20,x19,[sp, #0x10]
00bc31ac	ldp x29,x30,[sp], #0x20
00bc31b0	autiasp
00bc31b4	ret
