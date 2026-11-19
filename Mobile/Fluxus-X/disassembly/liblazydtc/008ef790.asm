; cpr::Session::SetAcceptEncoding @ 008ef790
008ef790	mov x8,x0
008ef794	add x0,x0,#0xb0
008ef798	cmp x0,x1
008ef79c	b.eq 0x008ef7b4
008ef7a0	ldr w9,[x1, #0x20]
008ef7a4	mov x2,xzr
008ef7a8	str w9,[x8, #0xd0]
008ef7ac	ldr x1,[x1, #0x10]
008ef7b0	b 0x00c31480
008ef7b4	ret
