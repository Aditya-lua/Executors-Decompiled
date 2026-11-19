; mbedtls_asn1_write_int @ 00b85924
00b85924	mov w8,#0x1
00b85928	ldr x9,[x0]
00b8592c	sub x10,x9,x1
00b85930	cmp x10,#0x1
00b85934	b.lt 0x00b85974
00b85938	sub x10,x9,#0x1
00b8593c	cmp w2,#0xff
00b85940	str x10,[x0]
00b85944	sturb w2,[x9, #-0x1]
00b85948	asr w2,w2,#0x8
00b8594c	add x8,x8,#0x1
00b85950	b.gt 0x00b85928
00b85954	ldr x9,[x0]
00b85958	ldrsb w10,[x9]
00b8595c	tbnz w10,#0x1f,0x00b8597c
00b85960	sub x8,x8,#0x1
00b85964	lsr x9,x8,#0x20
00b85968	cbz x9,0x00b8599c
00b8596c	mov w0,#0xffffff9c
00b85970	ret
00b85974	mov w0,#0xffffff94
00b85978	ret
00b8597c	sub x10,x9,x1
00b85980	cmp x10,#0x1
00b85984	b.lt 0x00b85a44
00b85988	sub x10,x9,#0x1
00b8598c	str x10,[x0]
00b85990	sturb wzr,[x9, #-0x1]
00b85994	lsr x9,x8,#0x20
00b85998	cbnz x9,0x00b8596c
00b8599c	mov w9,#0x1
00b859a0	cmp x8,#0x80
00b859a4	b.cc 0x00b859b8
00b859a8	mov x10,x8
00b859ac	lsr x10,x10,#0x8
00b859b0	add w9,w9,#0x1
00b859b4	cbnz x10,0x00b859ac
00b859b8	ldr x11,[x0]
00b859bc	sub x10,x11,x1
00b859c0	cmp x10,w9, UXTW 
00b859c4	b.ge 0x00b859d0
00b859c8	mov w0,#0xffffff94
00b859cc	ret
00b859d0	sub x12,x11,#0x1
00b859d4	lsr x10,x8,#0x8
00b859d8	str x12,[x0]
00b859dc	sturb w8,[x11, #-0x1]
00b859e0	cbz x10,0x00b859fc
00b859e4	ldr x11,[x0]
00b859e8	sub x12,x11,#0x1
00b859ec	str x12,[x0]
00b859f0	sturb w10,[x11, #-0x1]
00b859f4	lsr x10,x10,#0x8
00b859f8	cbnz x10,0x00b859e4
00b859fc	cmp w9,#0x2
00b85a00	b.cc 0x00b85a18
00b85a04	ldr x10,[x0]
00b85a08	add w11,w9,#0x7f
00b85a0c	sub x12,x10,#0x1
00b85a10	str x12,[x0]
00b85a14	sturb w11,[x10, #-0x1]
00b85a18	ldr x10,[x0]
00b85a1c	sub x11,x10,x1
00b85a20	cmp x11,#0x1
00b85a24	b.lt 0x00b85a4c
00b85a28	sub x11,x10,#0x1
00b85a2c	add w8,w8,w9
00b85a30	mov w12,#0x2
00b85a34	str x11,[x0]
00b85a38	add w0,w8,#0x1
00b85a3c	sturb w12,[x10, #-0x1]
00b85a40	ret
00b85a44	mov w0,#0xffffff94
00b85a48	ret
00b85a4c	mov w0,#0xffffff94
00b85a50	ret
