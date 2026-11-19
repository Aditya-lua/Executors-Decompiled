; ASN1_GENERALIZEDTIME_adj @ 009ef798
009ef798	sub sp,sp,#0x70
009ef79c	stp x29,x30,[sp, #0x60]
009ef7a0	add x29,sp,#0x60
009ef7a4	stp x20,x19,[sp, #0x50]
009ef7a8	mov x19,x0
009ef7ac	stur x1,[x29, #-0x28]
009ef7b0	sub x0,x29,#0x28
009ef7b4	mov x1,sp
009ef7b8	stp x22,x21,[sp, #0x40]
009ef7bc	mov x20,x3
009ef7c0	mov w22,w2
009ef7c4	bl 0x00c37980
009ef7c8	cbz x0,0x009ef804
009ef7cc	mov x21,x0
009ef7d0	cbnz w22,0x009ef7d8
009ef7d4	cbz x20,0x009ef7ec
009ef7d8	mov x0,x21
009ef7dc	mov w1,w22
009ef7e0	mov x2,x20
009ef7e4	bl 0x00c37990
009ef7e8	cbz w0,0x009ef800
009ef7ec	orr w2,wzr,#0x18
009ef7f0	mov x0,x19
009ef7f4	mov x1,x21
009ef7f8	bl 0x00c379c0
009ef7fc	b 0x009ef804
009ef800	mov x0,xzr
009ef804	ldp x29,x30,[sp, #0x60]
009ef808	ldp x20,x19,[sp, #0x50]
009ef80c	ldp x22,x21,[sp, #0x40]
009ef810	add sp,sp,#0x70
009ef814	ret
