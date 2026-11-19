; ASN1_TYPE_get @ 009efad4
009efad4	mov x8,x0
009efad8	ldr w0,[x0]
009efadc	orr w9,w0,#0x4
009efae0	cmp w9,#0x5
009efae4	b.eq 0x009efaf0
009efae8	ldr x8,[x8, #0x8]
009efaec	cbz x8,0x009efaf4
009efaf0	ret
009efaf4	mov w0,wzr
009efaf8	ret
