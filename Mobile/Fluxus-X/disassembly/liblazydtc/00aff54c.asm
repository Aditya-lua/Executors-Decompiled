; FUN_00aff54c @ 00aff54c
00aff54c	sub sp,sp,#0x70
00aff550	stp x28,x27,[sp, #0x10]
00aff554	stp x26,x25,[sp, #0x20]
00aff558	stp x24,x23,[sp, #0x30]
00aff55c	stp x22,x21,[sp, #0x40]
00aff560	stp x20,x19,[sp, #0x50]
00aff564	stp x29,x30,[sp, #0x60]
00aff568	add x29,sp,#0x60
00aff56c	mov x22,x3
00aff570	mov w21,w2
00aff574	mov x19,x1
00aff578	mov x20,x0
00aff57c	bl 0x00c325e0
00aff580	cmp w0,#0x1
00aff584	b.lt 0x00aff5a8
00aff588	adrp x1,0x2b8000
00aff58c	adrp x3,0x2ab000
00aff590	add x1,x1,#0x588
00aff594	add x3,x3,#0x32c
00aff598	mov x0,x19
00aff59c	mov w2,w21
00aff5a0	mov x4,x22
00aff5a4	bl 0x00c32250
00aff5a8	mov x0,x20
00aff5ac	bl 0x00c325e0
00aff5b0	cmp w0,#0x1
00aff5b4	b.lt 0x00aff7d0
00aff5b8	mov x0,x20
00aff5bc	mov w1,wzr
00aff5c0	add w21,w21,#0x2
00aff5c4	bl 0x00c32610
00aff5c8	adrp x1,0x2bb000
00aff5cc	adrp x3,0x2ab000
00aff5d0	mov x22,x0
00aff5d4	add x1,x1,#0x9d8
00aff5d8	add x3,x3,#0x32c
00aff5dc	mov x0,x19
00aff5e0	mov w2,w21
00aff5e4	bl 0x00c32250
00aff5e8	ldr x1,[x22]
00aff5ec	ldr w8,[x1]
00aff5f0	cmp w8,#0x7
00aff5f4	b.ne 0x00aff68c
00aff5f8	ldr x25,[x1, #0x8]
00aff5fc	mov w9,#0x4
00aff600	mov w10,#0x10
00aff604	ldr w8,[x25]
00aff608	ldr x0,[x25, #0x8]
00aff60c	cmp w8,#0x4
00aff610	csel w9,w8,w9,lt
00aff614	cmp w8,#0xf
00aff618	csel w23,w10,w9,gt
00aff61c	mov w1,w23
00aff620	sub w24,w8,w23
00aff624	bl 0x00c409c0
00aff628	ldr x8,[x25, #0x8]
00aff62c	mov x22,x0
00aff630	mov w1,w24
00aff634	add x0,x8,w23, SXTW 
00aff638	bl 0x00c409c0
00aff63c	mov x23,x0
00aff640	cbz x22,0x00aff660
00aff644	cbz x23,0x00aff660
00aff648	adrp x1,0x2ce000
00aff64c	add x1,x1,#0x4bc
00aff650	mov x0,x19
00aff654	mov x2,x22
00aff658	mov x3,x23
00aff65c	bl 0x00c32250
00aff660	adrp x24,0x2bc000
00aff664	add x24,x24,#0x5f4
00aff668	mov w2,#0xd9
00aff66c	mov x0,x22
00aff670	mov x1,x24
00aff674	bl 0x00c32310
00aff678	mov w2,#0xda
00aff67c	mov x0,x23
00aff680	mov x1,x24
00aff684	bl 0x00c32310
00aff688	b 0x00aff694
00aff68c	mov x0,x19
00aff690	bl 0x00c3f070
00aff694	mov x0,x20
00aff698	bl 0x00c325e0
00aff69c	cmp w0,#0x2
00aff6a0	b.lt 0x00aff7d0
00aff6a4	adrp x23,0x2c4000
00aff6a8	adrp x27,0x2bb000
00aff6ac	adrp x25,0x2ab000
00aff6b0	mov w22,#0x1
00aff6b4	add x23,x23,#0xdae
00aff6b8	add x27,x27,#0x9d8
00aff6bc	add x25,x25,#0x32c
00aff6c0	str x20,[sp, #0x8]
00aff6c4	mov x0,x19
00aff6c8	mov x1,x23
00aff6cc	bl 0x00c32260
00aff6d0	mov x0,x20
00aff6d4	mov w1,w22
00aff6d8	bl 0x00c32610
00aff6dc	mov x26,x0
00aff6e0	mov x0,x19
00aff6e4	mov x1,x27
00aff6e8	mov w2,w21
00aff6ec	mov x3,x25
00aff6f0	bl 0x00c32250
00aff6f4	ldr x1,[x26]
00aff6f8	ldr w8,[x1]
00aff6fc	cmp w8,#0x7
00aff700	b.ne 0x00aff7b4
00aff704	ldr x24,[x1, #0x8]
00aff708	mov w9,#0x4
00aff70c	mov w10,#0x10
00aff710	mov w20,w21
00aff714	ldr w8,[x24]
00aff718	ldr x0,[x24, #0x8]
00aff71c	mov x21,x25
00aff720	mov x25,x23
00aff724	cmp w8,#0x4
00aff728	csel w9,w8,w9,lt
00aff72c	cmp w8,#0xf
00aff730	csel w26,w10,w9,gt
00aff734	mov w1,w26
00aff738	sub w23,w8,w26
00aff73c	bl 0x00c409c0
00aff740	ldr x8,[x24, #0x8]
00aff744	mov x28,x0
00aff748	mov w1,w23
00aff74c	add x0,x8,w26, SXTW 
00aff750	bl 0x00c409c0
00aff754	mov x26,x0
00aff758	cbz x28,0x00aff778
00aff75c	cbz x26,0x00aff778
00aff760	adrp x1,0x2ce000
00aff764	mov x0,x19
00aff768	add x1,x1,#0x4bc
00aff76c	mov x2,x28
00aff770	mov x3,x26
00aff774	bl 0x00c32250
00aff778	adrp x23,0x2bc000
00aff77c	add x23,x23,#0x5f4
00aff780	mov w2,#0xd9
00aff784	mov x0,x28
00aff788	mov x1,x23
00aff78c	bl 0x00c32310
00aff790	mov w2,#0xda
00aff794	mov x0,x26
00aff798	mov x1,x23
00aff79c	bl 0x00c32310
00aff7a0	mov x23,x25
00aff7a4	mov x25,x21
00aff7a8	mov w21,w20
00aff7ac	ldr x20,[sp, #0x8]
00aff7b0	b 0x00aff7bc
00aff7b4	mov x0,x19
00aff7b8	bl 0x00c3f070
00aff7bc	mov x0,x20
00aff7c0	add w22,w22,#0x1
00aff7c4	bl 0x00c325e0
00aff7c8	cmp w22,w0
00aff7cc	b.lt 0x00aff6c4
00aff7d0	ldp x29,x30,[sp, #0x60]
00aff7d4	ldp x20,x19,[sp, #0x50]
00aff7d8	ldp x22,x21,[sp, #0x40]
00aff7dc	ldp x24,x23,[sp, #0x30]
00aff7e0	ldp x26,x25,[sp, #0x20]
00aff7e4	ldp x28,x27,[sp, #0x10]
00aff7e8	add sp,sp,#0x70
00aff7ec	ret
