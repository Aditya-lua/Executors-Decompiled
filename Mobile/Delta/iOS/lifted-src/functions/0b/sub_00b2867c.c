/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2867c..0xb28920 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b2867c(unsigned long a0, unsigned long long a1, unsigned long a2)
{
    unsigned long long *v5;  // x8
    unsigned long v6;  // x24
    unsigned long long v7;  // x19
    unsigned long long v8;  // x23
    unsigned long long v9;  // w8
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    unsigned long v0;  // [bp-0x90]
    char v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (a0 && a1)
    {
        v5 = *(long long *)a1;
        v6 = *v5;
        if (!(a2 & 1) || !*(long long *)(a1 + 80) && !*(long long *)(a1 + 96))
        {
            v7 = 0;
            v8 = 0;
            v9 = 1;
            if (!*(long long *)(a1 + 64))
                goto LABEL_b28878;
LABEL_b286d8:
            if (v9 && !(v0 = v6, (int)sub_9d524c(a0, "%s Public-Key:\n") >= 1))
                goto LABEL_b288b0;
            v11 = sub_a6bf4c(*(long long *)(*(long long *)a1 + 24), "providers/implementations/encode_decode/ml_kem_codecs.c", 602);
            if (v11)
            {
                v11 = v11;
                if (sub_a82fdc())
                {
                    if (!sub_a2fd10(a0, "ek:", v11, v5[3]))
                        v8 &= 0xffffffff;
                    else
                        v8 = 1;
                }
            }
        }
        else
        {
            v0 = v6;
            if ((int)sub_9d524c(a0, "%s Private-Key:\n") < 1)
            {
                if (*(long long *)&g_10002b0 == v2)
                    return 0;
                ___stack_chk_fail();
            }
            if (*(long long *)(a1 + 96) && (!sub_a83238(&v1, 64, a1) || !sub_a2fd10(a0, "seed:", &v1, 64)))
            {
                v7 = 0;
                goto LABEL_b288b4;
            }
            v9 = (int)*(long long *)(a1 + 80);
            if (!*(long long *)(a1 + 80))
            {
                v7 = 0;
                goto LABEL_b2886c;
            }
            v10 = sub_a6bf4c(v5[1], "providers/implementations/encode_decode/ml_kem_codecs.c", 586);
            if (!v10)
            {
                if (*(long long *)&g_10002b0 == v2)
                    return 0;
                ___stack_chk_fail();
            }
            v7 = v10;
            if (sub_a830a4() && sub_a2fd10(a0, "dk:", v7, v5[1]))
            {
                v9 = 0;
LABEL_b2886c:
                v8 = 1;
                if (*(long long *)(a1 + 64))
                    goto LABEL_b286d8;
LABEL_b28878:
                if (v9)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 611, "ossl_ml_kem_key_to_text");
                    v0 = v6;
                    sub_a36abc(57, 128, "no %s key material available");
                    goto LABEL_b288b0;
                }
                else
                {
                    v11 = 0;
                    v8 = 1;
                }
            }
            else
            {
LABEL_b288b0:
                v11 = 0;
LABEL_b288b4:
                v8 = 0;
            }
        }
        sub_a6c2e4(v11, "providers/implementations/encode_decode/ml_kem_codecs.c", 616);
        sub_a6c2e4(v7, "providers/implementations/encode_decode/ml_kem_codecs.c", 617);
        if (*(long long *)&g_10002b0 == v2)
            return v8;
        ___stack_chk_fail();
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 566, "ossl_ml_kem_key_to_text");
    sub_a36abc(59, 0xc0102, 0);
    if (*(long long *)&g_10002b0 == v2)
        return 0;
    ___stack_chk_fail();
}
