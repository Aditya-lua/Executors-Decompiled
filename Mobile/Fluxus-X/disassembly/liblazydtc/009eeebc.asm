; ASN1_TIME_check @ 009eeebc
009eeebc	ldr w8,[x0, #0x4]
009eeec0	cmp w8,#0x17
009eeec4	b.eq 0x009eeed4
009eeec8	cmp w8,#0x18
009eeecc	b.ne 0x009eeed8
009eeed0	b 0x00c374c0
009eeed4	b 0x00c37960
009eeed8	mov w0,wzr
009eeedc	ret
