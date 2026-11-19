; FUN_009fe654 @ 009fe654
009fe654	str x23,[sp, #-0x40]!
009fe658	stp x22,x21,[sp, #0x10]
009fe65c	stp x20,x19,[sp, #0x20]
009fe660	mov w19,w4
009fe664	mov x23,x3
009fe668	mov x20,x2
009fe66c	mov x21,x1
009fe670	mov x22,x0
009fe674	stp x29,x30,[sp, #0x30]
009fe678	add x29,sp,#0x30
009fe67c	cbnz x1,0x009fe68c
009fe680	ldr x8,[x22]
009fe684	mov w0,wzr
009fe688	cbz x8,0x009fe750
009fe68c	ldr x8,[x20]
009fe690	ldr x9,[x23]
009fe694	mov w0,wzr
009fe698	cmp x8,x9
009fe69c	b.hi 0x009fe750
009fe6a0	cbz x21,0x009fe724
009fe6a4	cmp x8,x9
009fe6a8	b.ne 0x009fe724
009fe6ac	mov w9,#0xfbff
009fe6b0	movk w9,#0x7fff, LSL #16
009fe6b4	cmp x8,x9
009fe6b8	mov w0,wzr
009fe6bc	b.hi 0x009fe750
009fe6c0	add x1,x8,#0x400
009fe6c4	str x1,[x23]
009fe6c8	ldr x0,[x21]
009fe6cc	cbz x0,0x009fe6ec
009fe6d0	adrp x2,0x2af000
009fe6d4	add x2,x2,#0xd26
009fe6d8	mov w3,#0x35f
009fe6dc	bl 0x00c356f0
009fe6e0	cbz x0,0x009fe764
009fe6e4	str x0,[x21]
009fe6e8	b 0x009fe724
009fe6ec	adrp x8,0x2af000
009fe6f0	add x8,x8,#0xd26
009fe6f4	mov w2,#0x352
009fe6f8	mov x0,x1
009fe6fc	mov x1,x8
009fe700	bl 0x00c32320
009fe704	str x0,[x21]
009fe708	cbz x0,0x009fe780
009fe70c	ldr x2,[x20]
009fe710	cbz x2,0x009fe720
009fe714	ldr x1,[x22]
009fe718	cbz x1,0x009fe7b0
009fe71c	bl 0x00c2ffd0
009fe720	str xzr,[x22]
009fe724	ldr x8,[x20]
009fe728	ldr x9,[x23]
009fe72c	cmp x8,x9
009fe730	b.cs 0x009fe74c
009fe734	ldr x9,[x22]
009fe738	cbnz x9,0x009fe740
009fe73c	ldr x9,[x21]
009fe740	add x10,x8,#0x1
009fe744	str x10,[x20]
009fe748	strb w19,[x9, x8]
009fe74c	mov w0,#0x1
009fe750	ldp x29,x30,[sp, #0x30]
009fe754	ldp x20,x19,[sp, #0x20]
009fe758	ldp x22,x21,[sp, #0x10]
009fe75c	ldr x23,[sp], #0x40
009fe760	ret
009fe764	bl 0x00c342a0
009fe768	adrp x0,0x2af000
009fe76c	adrp x2,0x2b2000
009fe770	add x0,x0,#0xd26
009fe774	add x2,x2,#0x69
009fe778	mov w1,#0x361
009fe77c	b 0x009fe798
009fe780	bl 0x00c342a0
009fe784	adrp x0,0x2af000
009fe788	adrp x2,0x2b2000
009fe78c	add x0,x0,#0xd26
009fe790	add x2,x2,#0x69
009fe794	mov w1,#0x353
009fe798	bl 0x00c342b0
009fe79c	mov w1,#0x100
009fe7a0	mov w0,#0x20
009fe7a4	movk w1,#0xc, LSL #16
009fe7a8	mov x2,xzr
009fe7ac	bl 0x00c342c0
009fe7b0	mov w0,wzr
009fe7b4	b 0x009fe750
