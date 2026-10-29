/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a8834..0x9a88f8 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a8834_0 {
    char padding_0[2816];
    long long field_b00;
    unsigned long long field_b08;
} st_9a8834_0;


int sub_9a8834(st_9a8834_0 *a0, long long a1)
{
    long long v3;  // x21
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (sub_a6ec4c(a1, a0->field_b00, a0->field_b08, 1))
    {
        v3 = 32 - ((unsigned int)a0->field_b08 + 2 & 31);
        if (sub_a6e86c(a1, v3, &v0, 1))
        {
            _bzero(v0, v3);
            return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_clnt.c", 4034, "tls_construct_next_proto");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
