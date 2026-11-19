; cpr::Error::getErrorCodeForCurlError @ 008fb0cc
008fb0cc	cmp w0,#0x53
008fb0d0	b.hi 0x008fb114
008fb0d4	adrp x9,0x746000
008fb0d8	mov w8,w0
008fb0dc	add x9,x9,#0x8c
008fb0e0	ldrsw x8,[x9, x8, LSL #0x2]
008fb0e4	add x8,x8,x9
008fb0e8	br x8
008fb0ec	mov w0,#0x10
008fb0f0	ret
008fb0f4	orr w0,wzr,#0xe
008fb0f8	ret
008fb0fc	orr w0,wzr,#0xe
008fb100	ret
008fb104	mov w0,#0xd
008fb108	ret
008fb10c	orr w0,wzr,#0xf
008fb110	ret
008fb114	mov w0,#0x4
008fb118	ret
008fb11c	mov w0,#0x5
008fb120	ret
008fb124	mov w0,#0x9
008fb128	ret
008fb12c	orr w0,wzr,#0x3
008fb130	ret
008fb134	mov w0,#0x1
008fb138	ret
008fb13c	mov w0,#0x8
008fb140	ret
008fb144	mov w0,#0xa
008fb148	ret
008fb14c	mov w0,#0x11
008fb150	ret
008fb154	mov w0,#0x2
008fb158	ret
008fb15c	orr w0,wzr,#0x7
008fb160	ret
008fb164	orr w0,wzr,#0x6
008fb168	ret
008fb16c	mov w0,#0xb
008fb170	ret
008fb174	orr w0,wzr,#0xe
008fb178	ret
008fb17c	orr w0,wzr,#0xc
008fb180	ret
008fb184	mov w0,#0xd
008fb188	ret
008fb18c	orr w0,wzr,#0xe
008fb190	ret
