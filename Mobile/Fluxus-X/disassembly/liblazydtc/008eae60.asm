; cpr::ProxyAuthentication::has @ 008eae60
008eae60	stp x29,x30,[sp, #-0x10]!
008eae64	mov x29,sp
008eae68	bl 0x00c31170
008eae6c	cmp x0,#0x0
008eae70	cset w0,ne
008eae74	ldp x29,x30,[sp], #0x10
008eae78	ret
