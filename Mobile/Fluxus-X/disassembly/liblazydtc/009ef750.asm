; ASN1_GENERALIZEDTIME_set @ 009ef750
009ef750	sub sp,sp,#0x60
009ef754	stp x29,x30,[sp, #0x50]
009ef758	add x29,sp,#0x50
009ef75c	str x19,[sp, #0x40]
009ef760	mov x19,x0
009ef764	stur x1,[x29, #-0x8]
009ef768	sub x0,x29,#0x8
009ef76c	add x1,sp,#0x8
009ef770	bl 0x00c37980
009ef774	cbz x0,0x009ef788
009ef778	mov x1,x0
009ef77c	orr w2,wzr,#0x18
009ef780	mov x0,x19
009ef784	bl 0x00c379c0
009ef788	ldp x29,x30,[sp, #0x50]
009ef78c	ldr x19,[sp, #0x40]
009ef790	add sp,sp,#0x60
009ef794	ret
