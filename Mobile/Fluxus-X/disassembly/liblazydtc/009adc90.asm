; ssl_cert_get_cert_store @ 009adc90
009adc90	add x8,x0,#0x1c8
009adc94	add x9,x0,#0x1d0
009adc98	cmp w2,#0x0
009adc9c	csel x8,x9,x8,eq
009adca0	ldr x8,[x8]
009adca4	mov w0,#0x1
009adca8	str x8,[x1]
009adcac	ret
