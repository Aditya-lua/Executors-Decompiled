; FUN_008c8948 @ 008c8948
008c8948	ldr x8,[x0, #0x50]
008c894c	ldr w9,[x8, #0x2c]
008c8950	ldr x10,[x8, #0x20]
008c8954	and w9,w9,#0xfffffff7
008c8958	str w9,[x8, #0x2c]
008c895c	ldr x9,[x0, #0x70]
008c8960	ldur w8,[x10, #-0x4]
008c8964	lsr x11,x8,#0x8
008c8968	asr w8,w8,#0x10
008c896c	add x9,x9,w11, UXTB  #0x4
008c8970	ldr w11,[x9, #0x3c]
008c8974	ldr q0,[x9, #0x30]
008c8978	cmp w11,#0x0
008c897c	str q0,[x9, #0x20]
008c8980	csinc w8,w8,wzr,ne
008c8984	ldr x9,[x0, #0x50]
008c8988	add x8,x10,w8, SXTW  #0x2
008c898c	str x8,[x9, #0x20]
008c8990	ret
