; ASN1_GENERALIZEDTIME_set_string @ 009ef6e8
009ef6e8	sub sp,sp,#0x40
009ef6ec	stp x20,x19,[sp, #0x20]
009ef6f0	mov x19,x0
009ef6f4	orr w8,wzr,#0x18
009ef6f8	mov x0,x1
009ef6fc	stp x29,x30,[sp, #0x30]
009ef700	add x29,sp,#0x30
009ef704	mov x20,x1
009ef708	str w8,[sp, #0xc]
009ef70c	bl 0x00c2ff50
009ef710	str w0,[sp, #0x8]
009ef714	add x1,sp,#0x8
009ef718	mov x0,xzr
009ef71c	stp x20,xzr,[sp, #0x10]
009ef720	bl 0x00c379e0
009ef724	cbz w0,0x009ef740
009ef728	cbz x19,0x009ef73c
009ef72c	add x1,sp,#0x8
009ef730	mov x0,x19
009ef734	bl 0x00c37940
009ef738	cbz w0,0x009ef740
009ef73c	mov w0,#0x1
009ef740	ldp x29,x30,[sp, #0x30]
009ef744	ldp x20,x19,[sp, #0x20]
009ef748	add sp,sp,#0x40
009ef74c	ret
