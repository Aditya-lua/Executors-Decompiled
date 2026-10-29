/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d03c..0x99d184 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99d03c_0 {
    char padding_0[124];
    void* field_7c;
    char padding_84[2172];
    void* field_900;
    char padding_908[448];
    void* field_ac8;
} st_99d03c_0;


void* sub_99d03c(st_99d03c_0 *a0, long long a1)
{
    void* v2;  // x8
    void* v3;  // x8
    void* v4;  // x21
    void* v5;  // x0
    void* v6;  // x22
    long long v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_96a380())
    {
LABEL_99d128:
        return 2;
    }
    v2 = *(long long *)&a0->padding_84[2168];
    if (*(int *)&(a0->padding_0)[1])
    {
        if (v2)
            goto LABEL_99d06c;
    }
    else
    {
        if (v2)
        {
            if (!(long long)v2[808] || *(int *)v2 == 772)
            {
LABEL_99d06c:
                v3 = *(long long *)&a0->padding_908[440];
                if (v3 && (long long)v3[8])
                {
                    v4 = *(short *)v3;
                    v5 = sub_a6bf4c(v4, "ssl/statem/extensions_clnt.c", 299);
                    v6 = *(long long *)&a0->padding_84[2168];
                    *(void* *)&v6[808] = v5;
                    if (!v5)
                    {
                        v7 = 301;
LABEL_99d134:
                        sub_a368c8();
                        sub_a369bc("ssl/statem/extensions_clnt.c", v7, "tls_construct_ctos_session_ticket");
                        sub_9a58a4(a0, 80, 0xc0103, 0);
                        return 0;
                    }
                    _memcpy();
                    *(void* *)&v6[816] = v4;
                    if (v4)
                        goto LABEL_99d0f0;
                }
            }
            else
            {
                v4 = (long long)v2[816];
                if (v4)
                    goto LABEL_99d0f0;
            }
        }
    }
    if (*(long long *)&a0->padding_908[440] && !*(long long *)(*(long long *)&a0->padding_908[440] + 8))
        goto LABEL_99d128;
    v4 = 0;
LABEL_99d0f0:
    if (sub_c68d5c(a1, 35, 2) && sub_a6ec4c(a1, *(long long *)(*(long long *)&a0->padding_84[2168] + 808), v4, 2))
        return 1;
    v7 = 316;
    goto LABEL_99d134;
}
