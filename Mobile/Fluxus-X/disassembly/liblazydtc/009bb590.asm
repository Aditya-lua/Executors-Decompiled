; SSL_use_certificate_file @ 009bb590
009bb590	sub sp,sp,#0x40
009bb594	stp x22,x21,[sp, #0x10]
009bb598	stp x20,x19,[sp, #0x20]
009bb59c	stp x29,x30,[sp, #0x30]
009bb5a0	add x29,sp,#0x30
009bb5a4	mov w21,w2
009bb5a8	mov x22,x1
009bb5ac	mov x20,x0
009bb5b0	str xzr,[sp, #0x8]
009bb5b4	bl 0x00c32270
009bb5b8	bl 0x00c32240
009bb5bc	mov x19,x0
009bb5c0	cbz x0,0x009bb614
009bb5c4	mov w1,#0x6c
009bb5c8	orr w2,wzr,#0x3
009bb5cc	mov x0,x19
009bb5d0	mov x3,x22
009bb5d4	bl 0x00c321a0
009bb5d8	cmp w0,#0x0
009bb5dc	b.le 0x009bb644
009bb5e0	sub w8,w21,#0x1
009bb5e4	cmp w8,#0x2
009bb5e8	b.cc 0x009bb670
009bb5ec	bl 0x00c342a0
009bb5f0	adrp x0,0x2db000
009bb5f4	adrp x2,0x2c5000
009bb5f8	add x0,x0,#0xaec
009bb5fc	add x2,x2,#0x682
009bb600	mov w1,#0x40
009bb604	bl 0x00c342b0
009bb608	mov w0,#0x14
009bb60c	orr w1,wzr,#0x7c
009bb610	b 0x009bb73c
009bb614	bl 0x00c342a0
009bb618	adrp x0,0x2db000
009bb61c	adrp x2,0x2c5000
009bb620	add x0,x0,#0xaec
009bb624	add x2,x2,#0x682
009bb628	mov w1,#0x36
009bb62c	bl 0x00c342b0
009bb630	mov w8,#0x2
009bb634	movk w8,#0x8, LSL #16
009bb638	add w1,w8,#0x5
009bb63c	mov w0,#0x14
009bb640	b 0x009bb73c
009bb644	bl 0x00c342a0
009bb648	adrp x0,0x2db000
009bb64c	adrp x2,0x2c5000
009bb650	add x0,x0,#0xaec
009bb654	add x2,x2,#0x682
009bb658	mov w1,#0x3b
009bb65c	bl 0x00c342b0
009bb660	mov w1,#0x2
009bb664	mov w0,#0x14
009bb668	movk w1,#0x8, LSL #16
009bb66c	b 0x009bb73c
009bb670	ldr x8,[x20, #0x9a8]
009bb674	ldr x0,[x8]
009bb678	ldr x1,[x8, #0x440]
009bb67c	bl 0x00c350a0
009bb680	str x0,[sp, #0x8]
009bb684	cbz x0,0x009bb6c8
009bb688	cmp w21,#0x1
009bb68c	b.eq 0x009bb6f4
009bb690	cmp w21,#0x2
009bb694	b.ne 0x009bb770
009bb698	add x1,sp,#0x8
009bb69c	mov x0,x19
009bb6a0	bl 0x00c32d90
009bb6a4	mov w8,#0x2
009bb6a8	movk w8,#0x8, LSL #16
009bb6ac	add w21,w8,#0xb
009bb6b0	cbz x0,0x009bb718
009bb6b4	ldr x1,[sp, #0x8]
009bb6b8	mov x0,x20
009bb6bc	bl 0x009bb34c
009bb6c0	mov w20,w0
009bb6c4	b 0x009bb748
009bb6c8	bl 0x00c342a0
009bb6cc	adrp x0,0x2db000
009bb6d0	adrp x2,0x2c5000
009bb6d4	add x0,x0,#0xaec
009bb6d8	add x2,x2,#0x682
009bb6dc	mov w1,#0x45
009bb6e0	bl 0x00c342b0
009bb6e4	mov w1,#0x100
009bb6e8	mov w0,#0x14
009bb6ec	movk w1,#0xc, LSL #16
009bb6f0	b 0x009bb73c
009bb6f4	ldr x2,[x20, #0x1d18]
009bb6f8	ldr x3,[x20, #0x1d20]
009bb6fc	add x1,sp,#0x8
009bb700	mov x0,x19
009bb704	bl 0x00c31a60
009bb708	mov w8,#0x2
009bb70c	movk w8,#0x8, LSL #16
009bb710	add w21,w8,#0x7
009bb714	cbnz x0,0x009bb6b4
009bb718	bl 0x00c342a0
009bb71c	adrp x0,0x2db000
009bb720	adrp x2,0x2c5000
009bb724	add x0,x0,#0xaec
009bb728	add x2,x2,#0x682
009bb72c	mov w1,#0x55
009bb730	bl 0x00c342b0
009bb734	mov w0,#0x14
009bb738	mov w1,w21
009bb73c	mov x2,xzr
009bb740	bl 0x00c342c0
009bb744	mov w20,wzr
009bb748	ldr x0,[sp, #0x8]
009bb74c	bl 0x00c31a90
009bb750	mov x0,x19
009bb754	bl 0x00c31a40
009bb758	mov w0,w20
009bb75c	ldp x29,x30,[sp, #0x30]
009bb760	ldp x20,x19,[sp, #0x20]
009bb764	ldp x22,x21,[sp, #0x10]
009bb768	add sp,sp,#0x40
009bb76c	ret
009bb770	bl 0x00c342a0
009bb774	adrp x0,0x2db000
009bb778	adrp x2,0x2c5000
009bb77c	add x0,x0,#0xaec
009bb780	add x2,x2,#0x682
009bb784	mov w1,#0x50
009bb788	b 0x009bb604
