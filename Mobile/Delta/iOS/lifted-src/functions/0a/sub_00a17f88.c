/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17f88..0xa18150 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a17f88_0 {
    char field_0;
} st_a17f88_0;


char sub_a17f88(st_a17f88_0 **a0, char a1)
{
    char v2;  // x19
    st_a17f88_0 **v3;  // x21
    char v4;  // x20
    char v5;  // x0
    long long v6;  // x21
    long long v7;  // x22
    char v8;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && *a0)
    {
        if (!((char)(*(char *)*a0) >> 1 & 1))
        {
            if (a1)
            {
                v2 = 0;
                goto LABEL_a18014;
            }
            a1 = sub_9dde10();
            v2 = a1;
            if (!a1)
            {
                v4 = 0;
                v6 = 524291;
                v7 = 72;
                goto LABEL_a180b4;
            }
LABEL_a18014:
            v3 = a0;
            if (!sub_a1ad70())
            {
                v4 = 0;
                v6 = 118;
                v7 = 79;
                goto LABEL_a180b4;
            }
            if (!v3[1])
            {
                v4 = 0;
                v6 = 113;
                v7 = 0x55;
                goto LABEL_a180b4;
            }
            if ((int)sub_a1b328(v3) >= 1)
            {
                v4 = sub_a1a56c(v3);
                if (!v4 || (v5 = sub_c4ba8(v3), !v5))
                    goto LABEL_a180e0;
                if (sub_9e4828())
                {
                    v6 = 128;
                    v7 = 100;
                    goto LABEL_a180b4;
                }
                if (!sub_a1b804(v3, v4, v5, 0, 0, a1))
                    goto LABEL_a180e0;
                if (sub_a1b4f4(v3, v4))
                {
                    v8 = 1;
                }
                else
                {
                    v6 = 122;
                    v7 = 107;
LABEL_a180b4:
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_check.c", v7, "EC_GROUP_check");
                    sub_a36abc(16, v6, 0);
LABEL_a180e0:
                    v8 = 0;
                }
            }
            else
            {
                v4 = 0;
                v6 = 107;
                v7 = 89;
                goto LABEL_a180b4;
            }
            sub_9dded4(v2);
            sub_a1a254(v4);
            return v8;
        }
        else
        {
            return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_check.c", 61, "EC_GROUP_check");
    sub_a36abc(16, 0xc0102, 0);
    return 0;
}
