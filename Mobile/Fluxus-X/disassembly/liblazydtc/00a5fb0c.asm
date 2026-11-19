; EVP_MD_CTX_set_flags @ 00a5fb0c
00a5fb0c	ldr x8,[x0, #0x18]
00a5fb10	sxtw x9,w1
00a5fb14	orr x8,x8,x9
00a5fb18	str x8,[x0, #0x18]
00a5fb1c	ret
