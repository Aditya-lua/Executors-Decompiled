; ASN1_TIME_set_string @ 009ef048
009ef048	stp x20,x19,[sp, #-0x20]!
009ef04c	stp x29,x30,[sp, #0x10]
009ef050	add x29,sp,#0x10
009ef054	mov x19,x1
009ef058	mov x20,x0
009ef05c	bl 0x00c37970
009ef060	cbz w0,0x009ef074
009ef064	ldp x29,x30,[sp, #0x10]
009ef068	mov w0,#0x1
009ef06c	ldp x20,x19,[sp], #0x20
009ef070	ret
009ef074	ldp x29,x30,[sp, #0x10]
009ef078	mov x0,x20
009ef07c	mov x1,x19
009ef080	ldp x20,x19,[sp], #0x20
009ef084	b 0x00c374e0
