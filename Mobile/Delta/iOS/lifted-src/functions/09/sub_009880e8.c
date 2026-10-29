/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9880e8..0x9882a0 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9880e8_0 {
    struct st_9880e8_0 *field_0;
    struct st_9880e8_0 *field_8;
    struct st_9880e8_0 *field_10;
} st_9880e8_0;

extern long long g_9882a0;
extern long long g_9882a8;
extern long long g_9882bc;
extern long long g_9882c4;
extern long long g_98836c;
extern char g_10002b0;

st_9880e8_0 * sub_9880e8(long long a0, long long a1)
{
    st_9880e8_0 *v3;  // x19
    st_9880e8_0 *v4;  // x20
    st_9880e8_0 *v5;  // x0
    st_9880e8_0 *v6;  // x0
    st_9880e8_0 *v7;  // x0
    st_9880e8_0 *v8;  // x21
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (sub_aa845c() != 1)
    {
        v4 = 0;
        goto LABEL_988260;
    }
    v3 = sub_a6bffc(32, "ssl/quic/quic_srtm.c", 0x77);
    if (v3)
    {
        v4 = sub_a4e104(a0, "AES-128-ECB", a1);
        if (v4 && !(v5 = sub_a4bc70(), v3->field_0 = v5, !v5 || !sub_a4d03c()))
        {
            sub_a4bbe4(v4);
            v6 = sub_a66520(sub_a66530(&g_9882a0, &g_9882a8), " ", "@", " ", "@");
            v3->field_8 = v6;
            if (v6)
            {
                v7 = sub_a66520(sub_a66530(&g_9882bc, &g_9882c4), " ", "@", " ", "@");
                v3->field_10 = v7;
                if (!v7)
                    goto LABEL_988210;
            }
            else
            {
LABEL_988210:
                v4 = 0;
                goto LABEL_988214;
            }
        }
        else
        {
LABEL_988214:
            sub_a66664(v3->field_10);
            v8 = v3->field_8;
            if (v8)
            {
                sub_a66c58(v8, &g_98836c);
                sub_a66664(v8);
            }
            sub_a4bca0(v3->field_0);
            sub_a6c2e4(v3, "ssl/quic/quic_srtm.c", 181);
LABEL_988260:
            sub_a4bbe4(v4);
            v3 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v0)
        return v3;
    ___stack_chk_fail();
}
