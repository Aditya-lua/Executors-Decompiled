; ASN1_TIME_compare @ 009ef648
009ef648	sub sp,sp,#0x20
009ef64c	stp x29,x30,[sp, #0x10]
009ef650	add x29,sp,#0x10
009ef654	mov x2,x1
009ef658	mov x3,x0
009ef65c	sub x0,x29,#0x4
009ef660	add x1,sp,#0x8
009ef664	bl 0x009ef1d0
009ef668	cbz w0,0x009ef694
009ef66c	ldur w8,[x29, #-0x4]
009ef670	mov w0,#0x1
009ef674	cmp w8,#0x0
009ef678	b.gt 0x009ef698
009ef67c	ldr w9,[sp, #0x8]
009ef680	cmp w9,#0x0
009ef684	b.gt 0x009ef698
009ef688	orr w8,w9,w8
009ef68c	asr w0,w8,#0x1f
009ef690	b 0x009ef698
009ef694	orr w0,wzr,#0xfffffffe
009ef698	ldp x29,x30,[sp, #0x10]
009ef69c	add sp,sp,#0x20
009ef6a0	ret
