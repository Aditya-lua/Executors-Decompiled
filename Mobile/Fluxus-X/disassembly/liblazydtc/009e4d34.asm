; ssl_allow_compression @ 009e4d34
009e4d34	ldrb w8,[x0, #0x9ea]
009e4d38	tbnz w8,#0x1,0x009e4d50
009e4d3c	orr w1,wzr,#0xf
009e4d40	mov w2,wzr
009e4d44	mov w3,wzr
009e4d48	mov x4,xzr
009e4d4c	b 0x00c34a30
009e4d50	mov w0,wzr
009e4d54	ret
