/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaea1e8..0xaea388 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aea1e8_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_aea1e8_1;

typedef struct st_aea1e8_0 {
    struct st_aea1e8_0 *field_0;
    struct st_aea1e8_0 *field_8;
} st_aea1e8_0;

extern long long g_eb8238;

st_aea1e8_0 * sub_aea1e8(unsigned long a0, unsigned long a1, long long a2)
{
    st_aea1e8_0 *v3;  // x19
    st_aea1e8_0 *v4;  // x21
    st_aea1e8_1 *v5;  // x24
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9cde20(&g_eb8238);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_pcons.c", 64, "v2i_POLICY_CONSTRAINTS");
        sub_a36abc(0x22, 0x8000d, 0);
        return v3;
    }
    if ((int)sub_ad69e4(a2) >= 1)
    {
        v4 = 0;
        do
        {
            v5 = sub_ad69f8(a2, v4);
            if (_strcmp(v5->field_8, "requireExplicitPolicy"))
            {
                if (_strcmp(v5->field_8, "inhibitPolicyMapping"))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_pcons.c", 76, "v2i_POLICY_CONSTRAINTS");
                    v0 = v5->field_8;
                    sub_a36abc(0x22, 106, "%s");
                    sub_9cd960(v3, &g_eb8238);
                    return 0;
                }
                else if (!sub_aef870(v5, &v3->field_8))
                {
                    sub_9cd960(v3, &g_eb8238);
                    return 0;
                }
            }
            else
            {
                if (!sub_aef870(v5, v3))
                {
                    sub_9cd960(v3, &g_eb8238);
                    return 0;
                }
            }
        } while ((v4 = (unsigned int)v4 + 1, (int)(unsigned int)v4 < (int)sub_ad69e4(a2)));
    }
    if (v3->field_8)
    {
        return v3;
    }
    else if (!v3->field_0)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_pcons.c", 83, "v2i_POLICY_CONSTRAINTS");
        sub_a36abc(0x22, 151, 0);
        sub_9cd960(v3, &g_eb8238);
        return 0;
    }
    else
    {
        return v3;
    }
}
