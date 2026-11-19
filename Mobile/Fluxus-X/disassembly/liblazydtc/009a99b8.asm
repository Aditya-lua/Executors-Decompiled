; ssl3_renegotiate_check @ 009a99b8
009a99b8	str x21,[sp, #-0x30]!
009a99bc	stp x20,x19,[sp, #0x10]
009a99c0	stp x29,x30,[sp, #0x20]
009a99c4	ldr w8,[x0, #0x1ac]
009a99c8	add x29,sp,#0x20
009a99cc	cbz w8,0x009a9a40
009a99d0	add x21,x0,#0xc58
009a99d4	mov x19,x0
009a99d8	mov x0,x21
009a99dc	mov w20,w1
009a99e0	bl 0x00c347c0
009a99e4	mov w8,w0
009a99e8	mov w0,wzr
009a99ec	cbnz w8,0x009a9a44
009a99f0	mov x0,x21
009a99f4	bl 0x00c347d0
009a99f8	mov w8,w0
009a99fc	mov w0,wzr
009a9a00	cbnz w8,0x009a9a44
009a9a04	cbnz w20,0x009a9a1c
009a9a08	mov x0,x19
009a9a0c	bl 0x00c344e0
009a9a10	mov w8,w0
009a9a14	mov w0,wzr
009a9a18	cbnz w8,0x009a9a44
009a9a1c	mov x0,x19
009a9a20	bl 0x00c34830
009a9a24	ldr d0,[x19, #0x1b0]
009a9a28	movi v1.2S,#0x1
009a9a2c	mov w0,#0x1
009a9a30	str wzr,[x19, #0x1ac]
009a9a34	add v0.2S,v0.2S,v1.2S
009a9a38	str d0,[x19, #0x1b0]
009a9a3c	b 0x009a9a44
009a9a40	mov w0,wzr
009a9a44	ldp x29,x30,[sp, #0x20]
009a9a48	ldp x20,x19,[sp, #0x10]
009a9a4c	ldr x21,[sp], #0x30
009a9a50	ret
