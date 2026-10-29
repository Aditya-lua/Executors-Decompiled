/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f42a0..0x9f4410 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f42a0_0 {
    struct st_9f42a0_0 *field_0;
} st_9f42a0_0;


long long sub_9f42a0(long long a0, st_9f42a0_0 **a1)
{
    unsigned long long len;  // x0
    st_9f42a0_0 **v3;  // x0
    unsigned long long v4;  // x23
    unsigned long long len1;  // x27
    st_9f42a0_0 **v6;  // x0
    st_9f42a0_0 **v7;  // x28
    st_9f42a0_0 **v8;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    len = _strlen();
    v3 = sub_a6d858(a1, a0);
    if (v3)
    {
        v4 = len + 2;
        do
        {
            len1 = _strlen(v3);
            if (len1 >= 6)
            {
                if (!sub_a6e200((char *)v3 + len1 - 5, ".conf"))
                    goto LABEL_9f4398;
            }
            else
            {
                if (len1 != 5)
                    continue;
            }
            if (sub_a6e200((char *)v3 + len1 - 4, ".cnf"))
                continue;
LABEL_9f4398:
            v6 = sub_a6bffc(v4 + len1, "crypto/conf/conf_def.c", 857);
            if (!v6)
                break;
            v7 = v6;
            if (!*(char *)v6)
            {
                sub_a6db20(v7, a0, v4 + len1);
                sub_a6db94(v7, "/", v4 + len1);
            }
            sub_a6db94(v7, v3, v4 + len1);
            v8 = sub_9d8180(v7, "r");
            sub_a6c2e4(v7, "crypto/conf/conf_def.c", 879);
            if (v8)
                return v8;
        } while ((v3 = sub_a6d858(a1, a0), v3));
    }
    sub_a6d93c(a1);
    *a1 = 0;
    return 0;
}
