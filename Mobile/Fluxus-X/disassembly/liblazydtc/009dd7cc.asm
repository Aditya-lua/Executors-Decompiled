; tls_construct_next_proto @ 009dd7cc
009dd7cc	str x21,[sp, #-0x30]!
009dd7d0	stp x20,x19,[sp, #0x10]
009dd7d4	stp x29,x30,[sp, #0x20]
009dd7d8	str xzr,[sp, #0x8]
009dd7dc	ldr x21,[x0, #0xb20]
009dd7e0	ldr x8,[x0, #0xb18]
009dd7e4	mov x19,x0
009dd7e8	mov x20,x1
009dd7ec	mov w3,#0x1
009dd7f0	mov x0,x1
009dd7f4	mov x1,x8
009dd7f8	mov x2,x21
009dd7fc	add x29,sp,#0x20
009dd800	bl 0x00c36f70
009dd804	cbz w0,0x009dd848
009dd808	add w8,w21,#0x2
009dd80c	and x8,x8,#0x1f
009dd810	mov w9,#0x20
009dd814	sub x21,x9,x8
009dd818	add x2,sp,#0x8
009dd81c	mov w3,#0x1
009dd820	mov x0,x20
009dd824	mov x1,x21
009dd828	bl 0x00c36f60
009dd82c	cbz w0,0x009dd848
009dd830	ldr x0,[sp, #0x8]
009dd834	mov w1,wzr
009dd838	mov x2,x21
009dd83c	bl 0x00c301c0
009dd840	mov w0,#0x1
009dd844	b 0x009dd880
009dd848	bl 0x00c342a0
009dd84c	adrp x0,0x2d7000
009dd850	adrp x2,0x2d7000
009dd854	add x0,x0,#0xb1a
009dd858	add x2,x2,#0xb5b
009dd85c	mov w1,#0xe08
009dd860	bl 0x00c342b0
009dd864	mov w2,#0x103
009dd868	mov w1,#0x50
009dd86c	movk w2,#0xc, LSL #16
009dd870	mov x0,x19
009dd874	mov x3,xzr
009dd878	bl 0x00c34410
009dd87c	mov w0,wzr
009dd880	ldp x29,x30,[sp, #0x20]
009dd884	ldp x20,x19,[sp, #0x10]
009dd888	ldr x21,[sp], #0x30
009dd88c	ret
