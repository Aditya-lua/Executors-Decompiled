; ASN1_GENERALIZEDTIME_check @ 009ef6c8
009ef6c8	ldr w8,[x0, #0x4]
009ef6cc	cmp w8,#0x18
009ef6d0	b.ne 0x009ef6e0
009ef6d4	mov x1,x0
009ef6d8	mov x0,xzr
009ef6dc	b 0x00c379e0
009ef6e0	mov w0,wzr
009ef6e4	ret
