; _INIT_12 @ 007fc724
007fc724	stp x29,x30,[sp, #-0x10]!
007fc728	mov x29,sp
007fc72c	adrp x8,0xcca000
007fc730	add x8,x8,#0x900
007fc734	ldarb w8,[x8]
007fc738	tbnz w8,#0x0,0x007fc7d0
007fc73c	adrp x0,0xcca000
007fc740	add x0,x0,#0x900
007fc744	bl 0x00c2fe90
007fc748	cbz w0,0x007fc7d0
007fc74c	adrp x8,0xcca000
007fc750	add x8,x8,#0xae0
007fc754	ldarb w9,[x8]
007fc758	adrp x8,0xcca000
007fc75c	add x8,x8,#0xad0
007fc760	tbz w9,#0x0,0x007fc7d8
007fc764	adrp x9,0xcca000
007fc768	ldrb w9,[x9, #0xadb]
007fc76c	cmp w9,#0x1
007fc770	b.ne 0x007fc7b8
007fc774	adrp x9,0x29b000
007fc778	ldrb w10,[x8, #0x8]
007fc77c	ldrb w11,[x8, #0x9]
007fc780	ldr d0,[x8]
007fc784	ldr d1,[x9, #0xea8]
007fc788	mov w9,#0x3b
007fc78c	eor w9,w11,w9
007fc790	ldrb w11,[x8, #0xa]
007fc794	eor w10,w10,#0xffffff87
007fc798	eor v0.8B,v0.8B,v1.8B
007fc79c	strb w10,[x8, #0x8]
007fc7a0	mov w10,#0x91
007fc7a4	eor w10,w11,w10
007fc7a8	strb w9,[x8, #0x9]
007fc7ac	strb w10,[x8, #0xa]
007fc7b0	str d0,[x8]
007fc7b4	strb wzr,[x8, #0xb]
007fc7b8	adrp x9,0xcca000
007fc7bc	adrp x0,0xcca000
007fc7c0	add x0,x0,#0x900
007fc7c4	str x8,[x9, #0x8f8]
007fc7c8	ldp x29,x30,[sp], #0x10
007fc7cc	b 0x00c2fea0
007fc7d0	ldp x29,x30,[sp], #0x10
007fc7d4	ret
007fc7d8	adrp x0,0xcca000
007fc7dc	add x0,x0,#0xae0
007fc7e0	bl 0x00c2fe90
007fc7e4	adrp x8,0xcca000
007fc7e8	add x8,x8,#0xad0
007fc7ec	cbz w0,0x007fc764
007fc7f0	adrp x9,0x29a000
007fc7f4	adrp x10,0x29a000
007fc7f8	nop
007fc7fc	adr x0,0x7fdf0c
007fc800	ldr d0,[x9, #0x9c8]
007fc804	ldr d1,[x10, #0x7a8]
007fc808	adrp x2,0xc48000
007fc80c	add x2,x2,#0x880
007fc810	adrp x1,0xcca000
007fc814	add x1,x1,#0xad0
007fc818	str d0,[x8]
007fc81c	str s1,[x8, #0x8]
007fc820	bl 0x00c2fe70
007fc824	adrp x0,0xcca000
007fc828	add x0,x0,#0xae0
007fc82c	bl 0x00c2fea0
007fc830	adrp x8,0xcca000
007fc834	add x8,x8,#0xad0
007fc838	b 0x007fc764
