; cpr::Session::SetProxyAuth @ 008ee6b4
008ee6b4	add x0,x0,#0x80
008ee6b8	mov x2,x1
008ee6bc	cmp x0,x1
008ee6c0	b.eq 0x008ee6cc
008ee6c4	ldr x1,[x2], #0x8
008ee6c8	b 0x00c31630
008ee6cc	ret
