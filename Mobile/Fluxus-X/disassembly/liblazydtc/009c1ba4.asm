; tls1_check_ec_tmp_key @ 009c1ba4
009c1ba4	ldr x8,[x0, #0x898]
009c1ba8	ldrb w8,[x8, #0x1e]
009c1bac	tst w8,#0x3
009c1bb0	b.eq 0x009c1be4
009c1bb4	mov w8,#0xc02c
009c1bb8	movk w8,#0x300, LSL #16
009c1bbc	cmp x1,x8
009c1bc0	b.eq 0x009c1c08
009c1bc4	mov w8,#0xc02b
009c1bc8	movk w8,#0x300, LSL #16
009c1bcc	cmp x1,x8
009c1bd0	mov w8,wzr
009c1bd4	b.ne 0x009c1c00
009c1bd8	mov w1,#0x17
009c1bdc	mov w2,#0x1
009c1be0	b 0x009c195c
009c1be4	stp x29,x30,[sp, #-0x10]!
009c1be8	mov w1,wzr
009c1bec	mov x29,sp
009c1bf0	bl 0x009c120c
009c1bf4	tst w0,#0xffff
009c1bf8	cset w8,ne
009c1bfc	ldp x29,x30,[sp], #0x10
009c1c00	mov w0,w8
009c1c04	ret
009c1c08	orr w1,wzr,#0x18
009c1c0c	mov w2,#0x1
009c1c10	b 0x009c195c
