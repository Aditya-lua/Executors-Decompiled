; ossl_asn1_utctime_to_tm @ 009efe24
009efe24	ldr w8,[x1, #0x4]
009efe28	cmp w8,#0x17
009efe2c	b.ne 0x009efe34
009efe30	b 0x00c379e0
009efe34	mov w0,wzr
009efe38	ret
