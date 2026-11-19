; cpr::Session::SetUrl @ 008ed79c
008ed79c	add x8,x0,#0x28
008ed7a0	cmp x8,x1
008ed7a4	b.eq 0x008ed7d8
008ed7a8	stp x29,x30,[sp, #-0x10]!
008ed7ac	mov x29,sp
008ed7b0	ldrb w9,[x1, #0x8]
008ed7b4	ldp x10,x11,[x1, #0x10]
008ed7b8	add x8,x1,#0x8
008ed7bc	add x0,x0,#0x30
008ed7c0	lsr w12,w9,#0x1
008ed7c4	tst w9,#0x1
008ed7c8	csinc x1,x11,x8,ne
008ed7cc	csel x2,x12,x10,eq
008ed7d0	bl 0x00c31090
008ed7d4	ldp x29,x30,[sp], #0x10
008ed7d8	ret
