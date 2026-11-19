; FUN_0080df9c @ 0080df9c
0080df9c	ldrb w8,[x0, #0x5d]
0080dfa0	cmp w8,#0x1
0080dfa4	b.ne 0x0080e060
0080dfa8	adrp x8,0x29a000
0080dfac	ldp d1,d2,[x0]
0080dfb0	ldr d0,[x8, #0x6b8]
0080dfb4	ldp d3,d4,[x0, #0x10]
0080dfb8	ldp d5,d6,[x0, #0x20]
0080dfbc	mov w9,#0xd9
0080dfc0	eor v1.8B,v1.8B,v0.8B
0080dfc4	eor v2.8B,v2.8B,v0.8B
0080dfc8	ldrb w8,[x0, #0x58]
0080dfcc	eor v3.8B,v3.8B,v0.8B
0080dfd0	eor v4.8B,v4.8B,v0.8B
0080dfd4	strb wzr,[x0, #0x5d]
0080dfd8	eor w8,w8,w9
0080dfdc	ldrb w9,[x0, #0x59]
0080dfe0	eor v6.8B,v6.8B,v0.8B
0080dfe4	stp d1,d2,[x0]
0080dfe8	eor v1.8B,v5.8B,v0.8B
0080dfec	ldp d2,d5,[x0, #0x30]
0080dff0	stp d3,d4,[x0, #0x10]
0080dff4	strb w8,[x0, #0x58]
0080dff8	mov w8,#0xd1
0080dffc	eor w8,w9,w8
0080e000	ldrb w9,[x0, #0x5a]
0080e004	stp d1,d6,[x0, #0x20]
0080e008	eor v2.8B,v2.8B,v0.8B
0080e00c	eor v3.8B,v5.8B,v0.8B
0080e010	strb w8,[x0, #0x59]
0080e014	mov w8,#0x93
0080e018	eor w8,w9,w8
0080e01c	mov w9,#0x61
0080e020	stp d2,d3,[x0, #0x30]
0080e024	ldp d1,d2,[x0, #0x40]
0080e028	ldr d3,[x0, #0x50]
0080e02c	strb w8,[x0, #0x5a]
0080e030	ldrb w8,[x0, #0x5b]
0080e034	eor v1.8B,v1.8B,v0.8B
0080e038	eor v2.8B,v2.8B,v0.8B
0080e03c	eor v0.8B,v3.8B,v0.8B
0080e040	eor w8,w8,w9
0080e044	ldrb w9,[x0, #0x5c]
0080e048	strb w8,[x0, #0x5b]
0080e04c	mov w8,#0x57
0080e050	eor w8,w9,w8
0080e054	stp d1,d2,[x0, #0x40]
0080e058	str d0,[x0, #0x50]
0080e05c	strb w8,[x0, #0x5c]
0080e060	ret
