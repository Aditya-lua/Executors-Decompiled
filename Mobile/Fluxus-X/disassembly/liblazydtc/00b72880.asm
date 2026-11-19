; mbedtls_camellia_crypt_cfb128 @ 00b72880
00b72880	str x25,[sp, #-0x50]!
00b72884	stp x24,x23,[sp, #0x10]
00b72888	stp x22,x21,[sp, #0x20]
00b7288c	stp x20,x19,[sp, #0x30]
00b72890	stp x29,x30,[sp, #0x40]
00b72894	add x29,sp,#0x40
00b72898	mov x20,x6
00b7289c	mov x21,x5
00b728a0	mov x22,x4
00b728a4	mov x19,x3
00b728a8	mov x23,x2
00b728ac	cmp w1,#0x1
00b728b0	mov x24,x0
00b728b4	b.hi 0x00b728c4
00b728b8	ldr x25,[x19]
00b728bc	cmp x25,#0xf
00b728c0	b.ls 0x00b728cc
00b728c4	mov w0,#0xffffffdc
00b728c8	b 0x00b7295c
00b728cc	cbz w1,0x00b72914
00b728d0	cbz x23,0x00b72954
00b728d4	cbnz x25,0x00b728ec
00b728d8	mov w1,#0x1
00b728dc	mov x0,x24
00b728e0	mov x2,x22
00b728e4	mov x3,x22
00b728e8	bl 0x00c41f80
00b728ec	ldrb w8,[x22, x25]
00b728f0	ldrb w9,[x21], #0x1
00b728f4	add w10,w25,#0x1
00b728f8	subs x23,x23,#0x1
00b728fc	eor w8,w9,w8
00b72900	strb w8,[x20], #0x1
00b72904	strb w8,[x22, x25]
00b72908	and x25,x10,#0xf
00b7290c	b.ne 0x00b728d4
00b72910	b 0x00b72954
00b72914	cbz x23,0x00b72954
00b72918	cbnz x25,0x00b72930
00b7291c	mov w1,#0x1
00b72920	mov x0,x24
00b72924	mov x2,x22
00b72928	mov x3,x22
00b7292c	bl 0x00c41f80
00b72930	ldrb w8,[x21], #0x1
00b72934	ldrb w9,[x22, x25]
00b72938	add w10,w25,#0x1
00b7293c	subs x23,x23,#0x1
00b72940	eor w9,w9,w8
00b72944	strb w9,[x20], #0x1
00b72948	strb w8,[x22, x25]
00b7294c	and x25,x10,#0xf
00b72950	b.ne 0x00b72918
00b72954	mov w0,wzr
00b72958	str x25,[x19]
00b7295c	ldp x29,x30,[sp, #0x40]
00b72960	ldp x20,x19,[sp, #0x30]
00b72964	ldp x22,x21,[sp, #0x20]
00b72968	ldp x24,x23,[sp, #0x10]
00b7296c	ldr x25,[sp], #0x50
00b72970	ret
