; PKCS12_key_gen_uni_ex @ 00aba568
00aba568	sub sp,sp,#0x190
00aba56c	stp x26,x25,[sp, #0x140]
00aba570	stp x24,x23,[sp, #0x150]
00aba574	stp x20,x19,[sp, #0x170]
00aba578	stp x29,x30,[sp, #0x180]
00aba57c	add x29,sp,#0x180
00aba580	mov w20,w6
00aba584	mov w23,w3
00aba588	mov w25,w1
00aba58c	cmp w6,#0x1
00aba590	str x28,[sp, #0x130]
00aba594	stp x22,x21,[sp, #0x160]
00aba598	stp w5,w4,[x29, #-0x58]
00aba59c	b.lt 0x00aba70c
00aba5a0	mov x22,x2
00aba5a4	mov x24,x0
00aba5a8	ldp x0,x2,[x29, #0x18]
00aba5ac	adrp x1,0x2a0000
00aba5b0	add x1,x1,#0xb01
00aba5b4	mov x19,x7
00aba5b8	bl 0x00c36210
00aba5bc	cbz x0,0x00aba70c
00aba5c0	mov x26,x0
00aba5c4	bl 0x00c361f0
00aba5c8	mov x21,x0
00aba5cc	mov x0,x26
00aba5d0	bl 0x00c36220
00aba5d4	cbz x21,0x00aba70c
00aba5d8	ldr x0,[x29, #0x10]
00aba5dc	add x26,sp,#0x30
00aba5e0	bl 0x00c36230
00aba5e4	mov x1,x0
00aba5e8	adrp x0,0x29d000
00aba5ec	add x0,x0,#0xe2e
00aba5f0	add x8,sp,#0x8
00aba5f4	mov x2,xzr
00aba5f8	bl 0x00c36280
00aba5fc	ldr x8,[sp, #0x28]
00aba600	ldur q0,[sp, #0x18]
00aba604	ldur q1,[sp, #0x8]
00aba608	adrp x0,0x2c3000
00aba60c	str x8,[sp, #0x50]
00aba610	sxtw x2,w25
00aba614	add x0,x0,#0xa6a
00aba618	add x8,sp,#0x8
00aba61c	mov x1,x24
00aba620	stp q1,q0,[sp, #0x30]
00aba624	bl 0x00c34c50
00aba628	ldr x8,[sp, #0x28]
00aba62c	ldur q0,[sp, #0x18]
00aba630	ldur q1,[sp, #0x8]
00aba634	adrp x0,0x2a7000
00aba638	str x8,[sp, #0x78]
00aba63c	sxtw x2,w23
00aba640	add x0,x0,#0xb6c
00aba644	add x8,sp,#0x8
00aba648	mov x1,x22
00aba64c	stur q0,[sp, #0x68]
00aba650	stur q1,[sp, #0x58]
00aba654	bl 0x00c34c50
00aba658	ldr x8,[sp, #0x28]
00aba65c	ldur q0,[sp, #0x18]
00aba660	ldur q1,[sp, #0x8]
00aba664	adrp x0,0x2be000
00aba668	str x8,[sp, #0xa0]
00aba66c	add x0,x0,#0x1ea
00aba670	add x8,sp,#0x8
00aba674	sub x1,x29,#0x54
00aba678	str q0,[x26, #0x60]
00aba67c	str q1,[sp, #0x80]
00aba680	bl 0x00c36260
00aba684	ldr x8,[sp, #0x28]
00aba688	ldur q0,[sp, #0x18]
00aba68c	ldur q1,[sp, #0x8]
00aba690	adrp x0,0x2ac000
00aba694	str x8,[sp, #0xc8]
00aba698	add x0,x0,#0x172
00aba69c	add x8,sp,#0x8
00aba6a0	sub x1,x29,#0x58
00aba6a4	stur q0,[x26, #0x88]
00aba6a8	stur q1,[x26, #0x78]
00aba6ac	bl 0x00c36260
00aba6b0	ldr x8,[sp, #0x28]
00aba6b4	ldur q0,[sp, #0x8]
00aba6b8	ldur q1,[sp, #0x18]
00aba6bc	str x8,[sp, #0xf0]
00aba6c0	add x8,sp,#0x8
00aba6c4	stp q0,q1,[x26, #0xa0]
00aba6c8	bl 0x00c34c40
00aba6cc	ldr x8,[sp, #0x28]
00aba6d0	ldur q0,[sp, #0x18]
00aba6d4	ldur q1,[sp, #0x8]
00aba6d8	sxtw x2,w20
00aba6dc	add x3,sp,#0x30
00aba6e0	mov x0,x21
00aba6e4	mov x1,x19
00aba6e8	str x8,[sp, #0x118]
00aba6ec	stur q0,[x26, #0xd8]
00aba6f0	stur q1,[x26, #0xc8]
00aba6f4	bl 0x00c36200
00aba6f8	cmp w0,#0x0
00aba6fc	mov x0,x21
00aba700	cset w19,ne
00aba704	bl 0x00c361e0
00aba708	b 0x00aba710
00aba70c	mov w19,wzr
00aba710	mov w0,w19
00aba714	ldp x29,x30,[sp, #0x180]
00aba718	ldp x20,x19,[sp, #0x170]
00aba71c	ldp x22,x21,[sp, #0x160]
00aba720	ldp x24,x23,[sp, #0x150]
00aba724	ldp x26,x25,[sp, #0x140]
00aba728	ldr x28,[sp, #0x130]
00aba72c	add sp,sp,#0x190
00aba730	ret
